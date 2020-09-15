package by.khodus.service.impl;

import by.khodus.entity.Resume;
import by.khodus.repository.ContactsRepository;
import by.khodus.repository.NamesRepository;
import by.khodus.repository.ResumeRepository;
import by.khodus.repository.TechnologiesRepository;
import by.khodus.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    ResumeRepository repository;

    @Autowired
    ContactsRepository contactsRepository;

    @Autowired
    NamesRepository namesRepository;

    @Autowired
    TechnologiesRepository technologiesRepository;

    public ResumeServiceImpl() {
    }

    @Override
    public void save(Resume resume) {
        repository.saveAndFlush(resume);
    }

    public void delete(int id) {
        repository.deleteById(id);
        namesRepository.deleteById(id);
        contactsRepository.deleteById(id);
        technologiesRepository.deleteById_resume(id);
    }

    @Override
    public List<Resume> getAll() {
        List<Resume> resumeList = repository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        for (Resume resume : resumeList
        ) {
            resume.setTechnology(technologiesRepository.getByIdResume(resume.getId()).toString());
        }
        return resumeList;
    }

    @Override
    public List<Resume> searchList(String name) {
        List<Resume> searchList;
        if (name.equals("")) {
            searchList = repository.findAll();
        } else {
            searchList = repository.searchList(name);
        }
        for (Resume resume : searchList
        ) {
            resume.setTechnology(technologiesRepository.getByIdResume(resume.getId()).toString());
        }
        return searchList;
    }

    @Override
    public Resume findById(int id) {
        return repository.getById(id).get(0);
    }


}

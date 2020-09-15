package by.khodus.service;

import by.khodus.entity.Resume;

import java.util.List;

public interface ResumeService {

    Resume findById(int id);

    void save(Resume resume);

    void delete(int id);

    List<Resume> getAll();

    List<Resume> searchList(String name);

}

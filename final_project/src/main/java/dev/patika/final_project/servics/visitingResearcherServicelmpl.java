package dev.patika.final_project.servics;

import dev.patika.final_project.models.visitingResearcher;
import dev.patika.final_project.repository.visitingResearcherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class visitingResearcherServicelmpl  {

    final visitingResearcherRepository visitingResearcherRepositoryr;
    @Transactional(readOnly = true)
    public List<visitingResearcher> findAll() {
        List<visitingResearcher> visitingResearcher=new ArrayList<>();
        Iterable<visitingResearcher> visitingResearcherIterable =visitingResearcherRepositoryr.findAll();
       visitingResearcherIterable.iterator().forEachRemaining(visitingResearcher::add);
        return visitingResearcher;
    }
    @Transactional
    public visitingResearcher save(visitingResearcher visitingResearcher) {
        return visitingResearcherRepositoryr.save(visitingResearcher);
    }

    @Transactional(readOnly = true)
    public visitingResearcher findById(int id) {
        return visitingResearcherRepositoryr.findById(id).get();
    }

    @Transactional
    public visitingResearcher uptdate(visitingResearcher visitingResearcher) {
      return visitingResearcherRepositoryr.save(visitingResearcher);
    }

    public void deleteById(int id) {
        visitingResearcherRepositoryr.deleteById(id);
    }
}


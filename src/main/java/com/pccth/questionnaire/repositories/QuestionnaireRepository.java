package com.pccth.questionnaire.repositories;

import com.pccth.questionnaire.entities.Questionnaire;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Long> {

}

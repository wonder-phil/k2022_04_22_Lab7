package com.example.k2022_04_22_lab7.models.questions

class Question(private var questionString: String,
               private var answerList: Answer,
               private var imageFullName: String  = "") {
    private var answers = answerList
    private var question = questionString
    private var imageName = imageFullName
}

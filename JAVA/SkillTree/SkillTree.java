package com.programmers.algorithm;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String sample = "";
        for(String skill_tree : skill_trees){
            sample = skill_tree.replaceAll("[^"+ skill + "]", "");
            System.out.println(sample);

            if(skill.indexOf(sample) == 0) answer++;
        }
        return answer;
    }
}

class SkillTreeTest{
    public static void main(String[] args) {
//        CBD, [BACDE, CBADF, AECB, BDA, AQWER]

        String skill = "CBD";
        String[] skill_tree = {"BACDE", "CBADF", "AECB", "BDA", "AQWER"};

        SkillTree skillTree = new SkillTree();
        System.out.println(skillTree.solution(skill, skill_tree));
    }
}

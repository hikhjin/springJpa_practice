package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain_ {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            //비영속
//            Member member = new Member(3L, "member3");
//            member.setId(3L);
//            member.setName("HelloB");
            //영속
//            em.persist(member);

//            em.flush();

//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("Hello1");

//            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();
//            for (Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }

            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member1 member = new Member1();
            member.setUsername("member1");
            member.changeTeam(team);
            em.persist(member);

            em.flush();
            em.clear();

            Team findTeam = em.find(Team.class, team.getId());
            List<Member1> members = findTeam.getMembers();

            System.out.println("findTeam = " + findTeam.getName());

            System.out.println("-----------------");
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        em.close();
        emf.close();
    }
}

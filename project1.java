import aima.core.search.api.Assignment;
import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.basic.csp.BacktrackingSearch;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;


class project1 {
    public static void main(String[] args) {

        // TURMAS

        // 1º Período

        Disciplina CalcA      = new Disciplina(1, "MAT0151" , "Cálculo A"                            , 0, 4, 60, null      );
        Disciplina Vetores    = new Disciplina(2, "MAT0150" , "Vetores e Geometria Analítica"        , 0, 4, 60, null      );
        Disciplina PF         = new Disciplina(3, "COMP0393", "Programação Funcional"                , 0, 4, 60, null      );
        Disciplina FEM        = new Disciplina(4, "MAT0057" , "Fundamentos Elementos da Matemática"  , 0, 4, 60, null      );
        Disciplina Seminarios = new Disciplina(5, "COMP0480", "Seminários em Computação"             , 0, 2, 30, null      );

        // 2º Período

        Disciplina CalcB       = new Disciplina(6,  "MAT0152" , "Cálculo B"                          , 0, 4, 60, 1         );
        Disciplina FisicaI     = new Disciplina(7,  "FISI0260", "Física I"                           , 0, 4, 60, 1, 2      );
        Disciplina LabFisicaI  = new Disciplina(8,  "FISI0264", "Laboratório de Física I"            , 0, 2, 30, 1         );
        Disciplina AlgLinearI  = new Disciplina(9,  "MAT0078" , "Álgebra Linear I"                   , 0, 4, 60, 2         );
        Disciplina Logica      = new Disciplina(10, "COMP0410", "Lógica para Computação"             , 0, 4, 60, 4         );
        Disciplina PI          = new Disciplina(11, "COMP0334", "Programação Imperativa"             , 0, 4, 60, null      );

        // 3º Período

        Disciplina CalcC      = new Disciplina(12, "MAT0153" , "Cálculo C"                           , 0, 4, 60, 6          );
        Disciplina LFC        = new Disciplina(13, "COMP0409", "Linguagens Formais e Computabilidade", 0, 4, 60, 10, 11     );
        Disciplina ED         = new Disciplina(14, "COMP0405", "Estruturas de Dados"                 , 0, 4, 60, 3 , 6 , 11 );
        Disciplina FSD        = new Disciplina(15, "COMP0416", "Fundamentos de Sistemas Digitais"    , 0, 4, 60, 4 , 11     );
        Disciplina PSD        = new Disciplina(16, "COMP0419", "Práticas em Sistemas Digitais"       , 0, 2, 30, 4 , 11     );
        Disciplina POO        = new Disciplina(17, "COMP0395", "Programação Orientada a Objetos"     , 0, 4, 60, 11         );

        // 4º Período

        Disciplina Estatistica = new Disciplina(18, "ESTAT0011", "Estatística Aplicada"              , 0, 4, 60, null       );
        Disciplina PAA         = new Disciplina(20, "COMP0412" , "Projeto e Análise de Algoritmos"   , 8, 4, 60, 4, 14      );
        Disciplina Grafos      = new Disciplina(21, "COMP0408" , "Grafos e Algoritmos Computacionais", 0, 4, 60, 10         );
        Disciplina Embarcados  = new Disciplina(22, "COMP0417" , "Fundamentos de Sistemas Embarcados", 0, 4, 60, 11         );
        Disciplina Arquitetura = new Disciplina(23, "COMP0415" , "Arquitetura de Computadores"       , 0, 4, 60, 11, 15, 16 );
        Disciplina MTPC        = new Disciplina(19, "COMP0481" , "Métodos e Técnicas de Pesquisa para Computação", 0, 2, 30, 5 );

        // 5º Período

        Disciplina IES         = new Disciplina(24, "COMP0478" , "Informática, Ética e Sociedade"    , 0, 4, 60, null       );
        Disciplina PPC         = new Disciplina(25, "COMP0397" , "Programação Paralela e Concorrente", 0, 4, 60, 14, 23     );
        Disciplina ESI         = new Disciplina(26, "COMP0438" , "Engenharia de Software I"          , 0, 4, 60, 17         );
        Disciplina Redes       = new Disciplina(27, "COMP0461" , "Redes de Computadores"             , 0, 4, 60, 23         );
        Disciplina BD          = new Disciplina(28, "COMP0455" , "Banco de Dados I"                  , 0, 4, 60, 14         );
        Disciplina SO          = new Disciplina(29, "COMP0472" , "Sistemas Operacionais"             , 0, 4, 60, 14, 23     );

        // 6º Período

        Disciplina LabRedes    = new Disciplina(30, "COMP0463" , "Laboratório de Redes de Computadores", 0, 2, 30, 27         );
        Disciplina ESII        = new Disciplina(31, "COMP0439" , "Engenharia de Software II"           , 0, 4, 60, 26         );
        Disciplina IHC         = new Disciplina(32, "COMP0443" , "Interface Humano-Computador"         , 0, 4, 60, 17         );
        Disciplina SD          = new Disciplina(33, "COMP0470" , "Sistemas Distribuídos"               , 0, 4, 60, 17, 27, 29 );
        Disciplina ProcImagens = new Disciplina(34, "COMP0432" , "Processamento de Imagens"            , 0, 4, 60, 2 , 11     );
        Disciplina IA          = new Disciplina(35, "COMP0427" , "Inteligência Artificial"             , 0, 4, 60, 18, 21     );

        // 7º Período

        Disciplina POCI         = new Disciplina(36, "COMP0483" , "Prática Orientada em Computação I"  , 0, 12, 180, 26, 27, 28 );
        Disciplina Compiladores = new Disciplina(37, "COMP0391" , "Compiladores"                       , 0, 4 , 60 , 13, 17     );

        // 8º Período

        Disciplina TCCI         = new Disciplina(38, "COMP0485" , "Trabalho de Conclusão de Curso I"   , 0, 0 , 60 , 19, 26, 27, 28 );

        // 9º Período

        Disciplina TCCII        = new Disciplina(38, "COMP0486" , "Trabalho de Conclusão de Curso II"   , 0, 0 , 120 , 38 );
        Disciplina Estagio      = new Disciplina(38, "COMP0482" , "Estágio Supervisionado em Computação", 0, 0 , 210 , 26, 27, 28 );

        // Vago

        Disciplina Vaga      = new Disciplina(0, "*" , "*", 0, 0 , 0 , null );


        // PROFESSORES

        Professor ProfA = new Professor(1, "Paulo Rabelo"    );
        Professor ProfB = new Professor(2, "Marcos Aurelio"  );
        Professor ProfC = new Professor(3, "Admilson Ribamar");
        Professor ProfD = new Professor(4, "Fillipe Dantas"  );
        Professor ProfE = new Professor(5, "Rogério Patricio");
        Professor ProfF = new Professor(6,  "Aryana Joecy"    );
        Professor ProfG = new Professor(7,  "André Mauricio"  );
        Professor ProfH = new Professor(8,  "Márcio André"    );
        Professor ProfI = new Professor(9,  "Giovana Gouveia" );
        Professor ProfJ = new Professor(10, "Daniel Dantas"   );
        Professor ProfK = new Professor(11, "Thiago Xavier"   );
        Professor ProfL = new Professor(12, "Adriano Veiga"   );
        Professor ProfM = new Professor(13, "Stoian Ivanov"   );
        Professor ProfN = new Professor(14, "Gastão Florêncio");
        Professor ProfO = new Professor(15, "A Definir"       );
        Professor ProfP = new Professor(16, "Kalil Araujo"    );
        Professor ProfQ = new Professor(17, "A Definir"       );
        Professor ProfR = new Professor(18, "Kenia Kodel Cox" );


        // TURMAS

        Turma Turma1_0 = new Turma(11, CalcA     , ProfA,  new Horario( 'T', "24", "12") );
        Turma Turma2_0 = new Turma(12, Vetores   , ProfB,  new Horario( 'T', "35", "34") );
        Turma Turma3_0 = new Turma(13, PF        , ProfC,  new Horario( 'T', "35", "56") );
        Turma Turma4_0 = new Turma(14, FEM       , ProfD,  new Horario( 'T', "35", "12") );
        Turma Turma5_0 = new Turma(15, Seminarios, ProfE,  new Horario( 'T', "6" , "56") );


        // TURMA DISPONÍVEIS PARA MATRÍCULA

        Turma Turma_CalcB1 = new Turma(1,   CalcB      , ProfF, new Horario('T', "24", "12"  ) );
        Turma Turma_CalcB2 = new Turma(2,   CalcB      , ProfL, new Horario('T', "24", "12"  ) );
        Turma Turma_FisI1  = new Turma(3,   FisicaI    , ProfG, new Horario('T', "35", "12"  ) );
        Turma Turma_FisI2  = new Turma(4,   FisicaI    , ProfM, new Horario('T', "24", "12"  ) );
        Turma Turma_LabF1  = new Turma(5,   LabFisicaI , ProfH, new Horario('T', "5" , "56"  ) );
        Turma Turma_LabF2  = new Turma(6,   LabFisicaI , ProfN, new Horario('T', "6" , "12"  ) );
        Turma Turma_AlgL1  = new Turma(7,   AlgLinearI , ProfI, new Horario('T', "35", "34"  ) );
        Turma Turma_AlgL2  = new Turma(8,   AlgLinearI , ProfO, new Horario('T', "35", "34"  ) );
        Turma Turma_Logic  = new Turma(9,   Logica     , ProfJ, new Horario('T', "24", "34"  ) );
        Turma Turma_PI1    = new Turma(10,  PI         , ProfK, new Horario('T', "35", "56"  ) );
        Turma Turma_PI2    = new Turma(11,  PI         , ProfP, new Horario('T', "24", "56"  ) );
        Turma Turma_Estat1 = new Turma(12,  Estatistica, ProfQ, new Horario('T', "35", "56"  ) );
        Turma Turma_Estat2 = new Turma(13,  Estatistica, ProfR, new Horario('T', "6" , "3456") );

        Turma Vago = new Turma(0, Vaga, null, new Horario('*', null, null));

        // DEFINIÇÃO DAS VARIÁVEIS DO CSP

        Object[] turmas = new Object[] {    Turma_CalcB1, Turma_CalcB2,   // Calculo B
                                            Turma_FisI1 , Turma_FisI2 ,   // Fisica I
                                            Turma_LabF1 , Turma_LabF2 ,   // Lab Fisica
                                            Turma_AlgL1 , Turma_AlgL2 ,   // Algebra Lin
                                            Turma_Logic ,                 // Logica
                                            Turma_PI1   , Turma_PI2   ,   // PI
                                            Turma_Estat1, Turma_Estat2,   // Estatistica
                                            Vago };

        int n = 8;  // QUANTIDADE MÁXIMA DE DISCIPLINAS
        String[] variables = new String[] {     "disc1", "disc2", "disc3",
                                                "disc4", "disc5", "disc6",
                                                "disc7", "disc8" };

        Object[][] domains = new Object[][] {   turmas, turmas, turmas,
                                                turmas, turmas, turmas,
                                                turmas, turmas  };

        Constraint[] sobreposicao = restringeSobreposicao(variables, n);
        Constraint[] repeticao = restringeRepeticao(variables, n);

        Constraint constraints[] = new Constraint[n*(n-1)];
        int i;
        for (i = 0; i < (n*(n-1)/2); i++) {
            constraints[2*i] = sobreposicao[i];
            constraints[2*i+1] = repeticao[i];
        }

        CSP csp3 = new BasicCSP( variables, domains, constraints );

        System.out.println(csp3);
        //
        // RESTRIÇÕES PARA CHOQUE DE HORÁRIO - OK
        // RESTRIÇÕES PARA MESMA DISCIPLINA  - OK
        //
        BacktrackingSearch bs = new BacktrackingSearch();

        Assignment asn = bs.apply(csp3);                // Default Backtracking
        System.out.println(asn.getAssignments());
    }
    public static Constraint[] restringeRepeticao(String[] variables, int n) {
        BasicConstraint[] constraints = new BasicConstraint[(n*(n-1))/2];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                constraints[c] = new BasicConstraint( new String[] { variables[i], variables[j] }, values -> ( saoDiferentes(((Turma) values[0]).getDisc().getCod(), ((Turma) values[1]).getDisc().getCod()) )) ;
                c++;
            }
        }
        return constraints;
    }
    public static Constraint[] restringeSobreposicao(String[] variables, int n) {
        BasicConstraint[] constraints = new BasicConstraint[(n*(n-1))/2];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                constraints[c] = new BasicConstraint( new String[] { variables[i], variables[j] }, values -> ( !seSobrepoem(((Turma) values[0]).getHorario(), ((Turma) values[1]).getHorario()) ));
                c++;
            }
        }
        return constraints;
    }

    public static boolean saoDiferentes(String cod1, String cod2) {
        return !cod1.equals(cod2);
    }
    public static boolean seSobrepoem(Horario h1, Horario h2) {
        if (h1.getTurno() == h2.getTurno()) {
            if ( chocaDia(h1.getDia(), h2.getDia()) ) {
                if ( chocaHora(h1.getHora(), h2.getHora()) ) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean chocaDia(String d1, String d2) {
        if (d1.equals(d2))
            return true;
        else {
            if ( (d1.charAt(0) == d2.charAt(d2.length() - 1)) || (d1.charAt(d1.length() - 1) == d2.charAt(0)) )
             return true;
        }
        return false;
    }
    public static boolean chocaHora(String h1, String h2) {
        if (h1.equals(h2))
            return true;
        else {
            if ( (h1.charAt(0) == h2.charAt(0)) || ( h1.charAt(h1.length() - 1) == h2.charAt(h1.length() - 1) ))
                return true;
        }
        return false;
    }
}
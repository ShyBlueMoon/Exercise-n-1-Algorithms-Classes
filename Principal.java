import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sexo, coletaDeAgua, lixoResidencial, novaPesquisaResidencia;
        int escolaridadeResidencia, totalDeResidencias, numeroDeMoradores, totalDeMoradores, totalDeHomens, totalDeMulheres, casaColetaChuva, casaNaoColetaChuva, casaSeparaLixo, casaNaoSeparaLixo, analfabetos, seriesIniciais, ensinoFundamental, ensinoMedio, ensinoSuperior, posGraduacao, outrosEscolaridade;
        float rendaFamiliar, totalDasRendas, percentualMulheres, percentualHomens, mediaRenda, mediaMoradores;



        totalDeResidencias = 0;

        totalDeHomens = 0;
        totalDeMulheres = 0;
        casaColetaChuva = 0;
        casaNaoColetaChuva = 0;
        casaSeparaLixo = 0;
        casaNaoSeparaLixo = 0;
        analfabetos = 0;
        seriesIniciais = 0;
        ensinoFundamental = 0;
        ensinoMedio = 0;
        ensinoSuperior = 0;
        posGraduacao = 0;
        outrosEscolaridade = 0;
        totalDeMoradores = 0;
        totalDasRendas = 0;



        do {
            System.out.println("====================================================");
            System.out.println("\t\tPESQUISA AMBIENTAL E ECONOMICA DO RS");
            System.out.println("====================================================");

            //SEXO DO ENTREVISTADO
            do {
                System.out.println("Qual o sexo?");
                System.out.println("M - Masculino\nF - Feminino");
                sexo = scanner.next().toUpperCase(Locale.ROOT).charAt(0);

                if ((sexo !='M')&&(sexo !='F')) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("  ERRO: Escolha invalida. Responda novamente M ou F.");
                    System.out.println("------------------------------------------------------");
                }

            } while ((sexo != 'M')&&(sexo != 'F'));

            if (sexo == 'M') {
                totalDeHomens++;

            } else if (sexo == 'F') {
                totalDeMulheres++;
            }

            // NUMERO DE MORADORES
            System.out.println("Digite o numero de moradores da residencia:");
            numeroDeMoradores = scanner.nextInt();
            totalDeMoradores = totalDeMoradores + numeroDeMoradores;

            // RENDA FAMILIAR DA RESIDENCIA
            System.out.println("Digite a renda total familiar da residencia:");
            rendaFamiliar = scanner.nextFloat();
            totalDasRendas = totalDasRendas + rendaFamiliar;

            // COLETA DE AGUA DA CHUVA
            do {
                System.out.println("A residencia possui coleta de agua da chuva?");
                System.out.println("S - Sim\nN - Nao");
                coletaDeAgua = scanner.next().toUpperCase().charAt(0);

                if ((coletaDeAgua != 'S')&&(coletaDeAgua != 'N')) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("  ERRO: Escolha invalida. Responda novamente S ou N.");
                    System.out.println("------------------------------------------------------");

                }

            } while ((coletaDeAgua != 'S') && (coletaDeAgua != 'N'));

            if (coletaDeAgua == 'S') {
                casaColetaChuva++;
            }else if (coletaDeAgua == 'N') {
                casaNaoColetaChuva++;
            }

            // SEPARACAO LIXO RESIDENCIAL

            do {
                System.out.println("Ha separacao do lixo residencial?");
                System.out.println("S - Sim\nN - Nao");
                lixoResidencial = scanner.next().toUpperCase().charAt(0);

                if ((lixoResidencial != 'S')&&(lixoResidencial != 'N')) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("  ERRO: Escolha invalida. Responda novamente S ou N.");
                    System.out.println("------------------------------------------------------");
                }

            } while ((lixoResidencial != 'S')&&(lixoResidencial != 'N'));

            if (lixoResidencial == 'S') {
                casaSeparaLixo++;

            } else if (lixoResidencial == 'N') {
                casaNaoSeparaLixo++;
            }


            //A MAIOR ESCOLARIDADE ENTRE OS MORADORES DA RESIDENCIA

            do {
                System.out.println("Qual a maior escolaridade entre os moradores da residencia?");
                System.out.println("1 - Analfabeto\n2 - Series iniciais\n3 - Ensino Fundamental\n4 - Ensino Medio\n5 - Ensino Superior\n6 - Pos Graduacao\n7 - Outros");
                escolaridadeResidencia = scanner.nextInt();

                switch (escolaridadeResidencia) {
                    case 1:
                        analfabetos++;
                        break;

                    case 2:
                        seriesIniciais++;
                        break;

                    case 3:
                        ensinoFundamental++;

                    case 4:
                        ensinoMedio++;
                        break;

                    case 5:
                        ensinoSuperior++;
                        break;

                    case 6:
                        posGraduacao++;
                        break;

                    case 7:
                        outrosEscolaridade++;
                        break;

                    default:
                        System.out.println("----------------------------------------------------");
                        System.out.println(" Numero escolhido invalido. Responda novamente.");
                        System.out.println("----------------------------------------------------");
                        break;

                }
            } while ((escolaridadeResidencia <= 0)||(escolaridadeResidencia >= 8));


            // DESEJA CADASTRAR UMA NOVA PESQUISA

            do {
                System.out.println("Deseja cadastrar uma nova pesquisa de residencia?");
                System.out.println("S - Sim\nN - Nao");
                novaPesquisaResidencia = scanner.next().toUpperCase().charAt(0);
                System.out.println(" ");
                System.out.println(" ");

                if ((novaPesquisaResidencia!='S')&&(novaPesquisaResidencia!='N')) {
                    System.out.println("------------------------------------------------------");
                    System.out.println("  ERRO: Escolha invalida. Responda novamente S ou N.");
                    System.out.println("------------------------------------------------------");
                }
            } while ((novaPesquisaResidencia != 'S')&&(novaPesquisaResidencia!='N'));



            //Total de residencias
            totalDeResidencias++;



        //REPETICAO DA PESQUISA
        } while (novaPesquisaResidencia == 'S');

        //Percentual de homens e mulheres pesquisados, media renda familiar e media de moradores por residencia
        percentualHomens =  ((float) (totalDeHomens)/(float) (totalDeResidencias)) * 100.0f;
        percentualMulheres =   ((float)(totalDeMulheres)/(float) (totalDeResidencias)) * 100.0f;
        mediaRenda = totalDasRendas/totalDeResidencias;
        mediaMoradores = (float) totalDeMoradores/totalDeResidencias;

        //RELATORIO GERAL
        System.out.println("==========================================================================");
        System.out.println("\t\t\t\t\t\t RELATORIO GERAL");
        System.out.println("==========================================================================");
        System.out.println(" ");

        System.out.println("- Total de residencias pesquisadas: " + totalDeResidencias);
        System.out.println("- Total de residencias que coletam e que nao coletam agua da chuva:");
        System.out.print("\tColetam agua: " + casaColetaChuva);
        System.out.println("\t\t\tNao coletam: " + casaNaoColetaChuva);
        System.out.println("- Total de residencias que separam e nao separam lixo:");
        System.out.print("\tSeparam lixo: " + casaSeparaLixo);
        System.out.println("\t\t\tNao separam: " + casaNaoSeparaLixo);

        System.out.println("- Total de homens e seu percentual:");
        System.out.print("\tTotal de homens: " + totalDeHomens);
        System.out.println("\t\tPercentual de homens: " + percentualHomens + "%");

        System.out.println("- Total de mulheres e seu percentual:");
        System.out.print("\tTotal de mulheres: " + totalDeMulheres);
        System.out.println("\t\tPercentual de mulheres: " + percentualMulheres + "%");

        System.out.println("- Media de renda familiar de todos os entrevistados: " + mediaRenda);
        System.out.println("- Media de moradores por residencia: " +  mediaMoradores);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ESCOLARIDADE TOTAL:");
        System.out.println("Analfabetos: " + analfabetos);
        System.out.println("Series iniciais: " + seriesIniciais);
        System.out.println("Ensino Fundamental: " + ensinoFundamental);
        System.out.println("Ensino Medio: " + ensinoMedio);
        System.out.println("Ensino Superior: " + ensinoSuperior);
        System.out.println("Pos Graduacao: " + posGraduacao);
        System.out.println("Outros: " + outrosEscolaridade);

        System.out.println("==========================================================================");
        System.out.println("==========================================================================");

    }
}

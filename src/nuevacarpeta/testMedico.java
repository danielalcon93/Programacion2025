package tema4;

public class testMedico {
    static void main(String[] args) {

            Medico medico1 = new Medico("Ana López", Especialidad.Cardiologia, 45, "ana@gmail.com", 600111222);

            Medico medico2 = new Medico("Luis Pérez", Especialidad.General, 38, "luis@gmail.com", 600333444);

            //Damos de baja a uno
            medico2.baja();

            //Pintamos los dos médicos
            System.out.println(medico1);
            System.out.println(medico2);
        }

}


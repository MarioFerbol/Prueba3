import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginControllerTest {

    @Autowired
    private LoginController loginController;

    @Test
    public void testLogin() {
        // Simular una solicitud de inicio de sesión
        String result = loginController.loginSubmit("usuario", "contrasena");

        // Verificar el resultado
        assertThat(result).isEqualTo("bienvenido");
    }
}

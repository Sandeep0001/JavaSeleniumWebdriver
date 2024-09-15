package seleniumwithdesignpatterns.builderpattern;

public class Register {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String telephone;
    private final String password;
    private final String confirmPassword;

    public Register(RegisterBuilder registerBuilder) {
        this.firstName = registerBuilder.firstName;
        this.lastName = registerBuilder.lastName;
        this.email = registerBuilder.email;
        this.telephone = registerBuilder.telephone;
        this.password = registerBuilder.password;
        this.confirmPassword = registerBuilder.confirmPassword;
    }

    //getters: -->Always maintain getters in main class as a good practise, this is to avoid any modification via main class.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static class RegisterBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String telephone;
        private String password;
        private String confirmPassword;

        //setters:

        public RegisterBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public RegisterBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RegisterBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public RegisterBuilder setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public RegisterBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public RegisterBuilder setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
            return this;
        }

        //Returning Register object
        public Register build(){
            return new Register(this); //returning builder class
        }
    }
}

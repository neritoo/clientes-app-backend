package com.gavilan.springbootbackendapirest.auth;

@SuppressWarnings("all")
public class JwtConfig {
    public static final String SECRET_KEY = "llave.secreta.12345";
    public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpAIBAAKCAQEAuwfLJaf2wseVMC6iTysHfSsLx+Rcs78DPH0PJqmqB6rvPFAR\n" +
            "Il9bIg5OVRXe/XJKpC04Qbu3GKFgiix2uhSwkXQcJvcuQSTgW6OGVandAkjyK9sg\n" +
            "wirsl6t8TFk2uDyGLacSoWIoKyMqA57JnHwmSjwFaEO8oasV6eFQf3/8AZZmtk9z\n" +
            "SGwzKOc+iKYIWKJJmd+8iX6ratuDODWbTFhgpFT0EtT3FfO7baS928CcannD8Qxq\n" +
            "PdkVTpQ2jX2T2FVSzH6R7QqR1xQusnYjOJNAp6XtB9i0A8ZxSDU+bMGegSIZMC/6\n" +
            "1JExry95MJFJM3JKUe1mpeeKUvnnmsGONNE1WwIDAQABAoIBAH4fGUzBYVOkBuTA\n" +
            "7c75M0mi14TqZ+EGNAZ8RtVJoFEfYciILaXCK9BhWU1jPEYo5lCj9cXN8gB4AoPq\n" +
            "y/1bql3LsJhOIzDmzyy8rv/hVhoOWtBcKlEFZRo6F83cc1v15H2wpo2RhYjhY5mh\n" +
            "YE9YIPH6W6Md2nwixNo8iG4SPjxKqbERpBX0apWfI/G+oP2Mtjf38vDgYRcY6GDe\n" +
            "XO+LLMYp/4CYwdyV54cpPtWvoIfyIAwhS9Izyno0N01YNgh3c5duZNZsz1JciXml\n" +
            "96kgNJ5K3IJ/ObYlYvPlx8sCMxk11RRjHdWVjuuhCBURI12e8pWaXvu9nU7TjaEr\n" +
            "UgcUOeECgYEA7m5uPvpVB3hWfCI68rN/ZAGFaaj6/XKwSZsA0Ov0CihiBrGAkczI\n" +
            "0aHpZ7PJhd+lVPqgLACils9geImdSfqQfNf+TE+R2yFmc8PJpJocswp5DIhdjuc2\n" +
            "Ya0Z6wT7QdTr/7grPg752c9a8AcAaOMGFXC6+aLDm1Mpa/8EjU3vLbkCgYEAyM/H\n" +
            "aKZSNMW4xwdwVwr+7/6pV3i5y2wXWQXo4ohKgDTkVO0O6oI/6q6FU3OLfojGggrF\n" +
            "N+elbkz51I0SZgO8og86eBNsYHlAKFTBRWGhKlNAq+qE3SLHFa5DubjWTX/Yi/EV\n" +
            "ZU97lP3NNy8wdgPIwpxf9tSEiYVvHhOAXuz8pbMCgYBnOlx028DwiQM4n0FSTrB6\n" +
            "xcXTJxvzmzIDzB4gVefEdhNqvnLhrP3M9QKuqUI4uclE73VlV6kNDh/AUCRPITJp\n" +
            "OsKYm2KUsvM+b6ffofGG+qPJ70hCVIxQ4bb076UwrVS31C60oZs+1+2ROhbNUm0R\n" +
            "30q0RenWV7z5SuHXo8RH0QKBgQC51M5MYd4hR/g+9vtXEa3qmlhLwkTtoxHYKEfj\n" +
            "mwyWqFvE27u5+N79ZpOrLnoglqJdJWps2cmV0VZBBGvKTBr8Pet1w0O/43Uj3Ysd\n" +
            "kcN7T5/BeD2MBusFfUbfT9XB0lWq62dJYcyTjGukbd8C122p6txDp1cfjIPP6Wwa\n" +
            "bGVBUQKBgQC4/UrDMstGaLq/i9Rlt/q0B+u2ggLbIkQZ697nfdFss//7nfJatZb/\n" +
            "avNPDpzHEXI4rkNOxJcqPrec7SPrptZj2XGp6g2EL744SmUPWYwp9xzREIBMQ8EK\n" +
            "nCvc6X2LUwGpMsVS8zPpcLmgRGX5XIwGdOwLbMD/PzVlYBJ8PueD6g==\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuwfLJaf2wseVMC6iTysH\n" +
            "fSsLx+Rcs78DPH0PJqmqB6rvPFARIl9bIg5OVRXe/XJKpC04Qbu3GKFgiix2uhSw\n" +
            "kXQcJvcuQSTgW6OGVandAkjyK9sgwirsl6t8TFk2uDyGLacSoWIoKyMqA57JnHwm\n" +
            "SjwFaEO8oasV6eFQf3/8AZZmtk9zSGwzKOc+iKYIWKJJmd+8iX6ratuDODWbTFhg\n" +
            "pFT0EtT3FfO7baS928CcannD8QxqPdkVTpQ2jX2T2FVSzH6R7QqR1xQusnYjOJNA\n" +
            "p6XtB9i0A8ZxSDU+bMGegSIZMC/61JExry95MJFJM3JKUe1mpeeKUvnnmsGONNE1\n" +
            "WwIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}

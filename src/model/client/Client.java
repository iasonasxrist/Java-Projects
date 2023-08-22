package model.client;

import model.enums.TypeOfClient;

public class Client implements Comparable<Client> {

    private String name;

    private Integer clientAFM;
    // TODO: 11/8/23  cast iNTEGER to long value
    private Integer phone;

    private String cityOfResident;

    private String countryOfResident;

    private TypeOfClient typeOfClient;


    public boolean validationOfAFM(Integer clientAFM) {
        String value = Integer.toString(clientAFM);
        int maxLength = 9;
        return value.length() == maxLength;
    }


    public boolean validationPhone(Integer phone) {
        String value = Integer.toString(phone);
        int length = 10;
        return value.length() != length;
    }

    public Client(String name, Integer clientAFM, Integer phone, String cityOfResident, String countryOfResident, TypeOfClient typeOfClient) {
        this.name = name;


        if (validationOfAFM(clientAFM)) {
            this.clientAFM = clientAFM;
        } else {
            throw new IllegalArgumentException("Invalid value length");
        }

        if (validationPhone(phone)) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone number");
        }

        this.cityOfResident = cityOfResident;
        this.countryOfResident = countryOfResident;

        this.typeOfClient = typeOfClient;

//        if (this.getTypeOfClient() == TypeOfClient.INDIVIDUAL){
//
//        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClientAFM() {
        return clientAFM;
    }

    public void setClientAFM(Integer clientAFM) {
        this.clientAFM = clientAFM;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getCityOfResident() {
        return cityOfResident;
    }

    public void setCityOfResident(String cityOfResident) {
        this.cityOfResident = cityOfResident;
    }

    public String getCountryOfResident() {
        return countryOfResident;
    }

    public void setCountryOfResident(String countryOfResident) {
        this.countryOfResident = countryOfResident;
    }

    public TypeOfClient getTypeOfClient() {
        return typeOfClient;
    }

    public void setTypeOfClient(TypeOfClient typeOfClient) {
        this.typeOfClient = typeOfClient;
    }

    @Override
    public String toString() {
        return "Client{" + "name='" + name + '\'' + ", clientAFM=" + clientAFM + ", phone=" + phone + ", cityOfResident='" + cityOfResident + '\'' + ", countryOfResident='" + countryOfResident + '\'' + ", typeOfClient=" + typeOfClient + '}';
    }

    @Override
    public int compareTo(Client o) {
        if (getClientAFM() < o.getClientAFM()) {

            return -1;
        } else if (getClientAFM() == o.getClientAFM()) {

            return 0;

        } else {
            return 1;
        }
    }
}




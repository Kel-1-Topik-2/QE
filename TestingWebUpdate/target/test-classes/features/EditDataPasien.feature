@EditPatientData
Feature: Edit Data Pasien - Admin

#Edit valid diubah data nik, nomor, nama
  @EditPatientDataValid
  Scenario Outline: As a admin i want to edit data pasien (JK Perempuan) - Valid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data pasien
    And Click Detail Patient data
    And Valid data detail pasien
    And Click button edit profil
    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin perempuan
    And Click button simpan
    And Valid edit data
    Examples:
      | email  |password|namalengkap|    nik        |usia|  nomortelepon   |    alamat    |
      |admin   |admin123| RobiCodet |7359567891237977|34|085243277755   |  perumahan   |

  @EditPatientDataInvalid
  Scenario Outline: As a admin i want to edit data pasien (JK Perempuan) - Invalid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data pasien
    And Click Detail Patient data
    And Valid data detail pasien
    And Click button edit profil
    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin perempuan
    And Click button simpan
    And Validate add error messenger "<text>" Pasien
    Examples:
      | email  |password|namalengkap|    nik           |usia|  nomortelepon   |    alamat    |text|
      |admin   |admin123|   56712   |    11221212      | 1  |   jngasjgxbba   |   970194371  |    |
      |admin   |admin123|  56712    | 1234567891234567 | 20 |   01294657612   |   perumahan  | hanya mengandung huruf |
      |admin   |admin123|  Bagas    |     11221212     | 20 |   01294657612   |   perumahan  |  nik perlu 16 digit  |
      |admin   |admin123|  Bagas    | 1234567891234567 | e  |  01294657612    |   perumahan  |    |
      |admin   |admin123|  Bagas    | 1234567891234567 | 20 |   jngasjgxbba   |   perumahan  | nomor telpon harus berupa angka |
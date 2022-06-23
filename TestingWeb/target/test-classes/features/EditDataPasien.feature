@EditPatientData
Feature: Edit Data Pasien - Admin

  Scenario Outline: As a admin i want to edit data pasien
    Given Open page data pasien
    And Click Detail Patient data
    When Valid data detail pasien
    And Click button edit profil
    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin patient
    And Click button simpan
    And Valid edit data
    Examples:
    |namalengkap|    nik      |usia|  nomortelepon   |    alamat    |
    |   56712   |  bGaSASUUQEW | ba |   jngasjgxbba   |   970194371  |
    |  56712    |  1234479680 | 20 |   01294657612   |   perumahan  |
    |  Bagas    |  bGaSASUUQE | 20 |   01294657612   |   perumahan  |
    |  Bagas    | 1234479680  | ba |  01294657612    |   perumahan  |
    |  Bagas    |  1234479680 | 20 |   jngasjgxbba   |   perumahan  |
    |  Bagas    |  1234479680 | 20 |   01294657612   |   970194371  |

@EditPatientData
Feature: Edit Data Pasien - Admin

  Scenario Outline: As a admin i want to edit data pasien (JK Perempuan)
    Given Open page data pasien
    And Click Detail Patient data
    When Valid data detail pasien
    And Click button edit profil
    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin perempuan
    And Click button simpan
    And Valid edit data
    Examples:
    |   namalengkap   |    nik      |usia|  nomortelepon   |    alamat    |
    |  Bagas Dwi S    |  1234479680 | 20 |   01294657612   |   Perumahan  |
    |     56712       | bGaSASUUQEW | ba |         -       |        -     |
    |     56712       |  1234479680 | 14 |   01294657612   |   Perumahan  |
    |  Bagas Dwi S    |  bGaSASUUQE | 12 |   01294657612   |   Perumahan  |
    |  Bagas Dwi S    | 1234479680  | ba |  01294657612    |   Perumahan  |
    |  Bagas Dwi S    |  1234479680 | 25 |   jngasjgxbba   |   Perumahan  |
    |  Bagas Dwi S    |  1234479680 | 29 |   01294657612   |   970194371  |

  Scenario Outline: As a admin i want to edit data pasien (JK Laki-Laki)
    Given Open page data pasien
    And Click Detail Patient data
    When Valid data detail pasien
    And Click button edit profil
    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin laki-laki
    And Click button simpan
    And Valid edit data
    Examples:
      |   namalengkap   |    nik      |usia|  nomortelepon   |    alamat    |
      |  Bagas Dwi S    |  1234479680 | 20 |   01294657612   |   Perumahan  |

  Scenario Outline: As a admin i want to edit data pasien but not gander
    Given Open page data pasien
    And Click Detail Patient data
    When Valid data detail pasien
    And Click button edit profil
    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And Click button simpan
    And Valid edit data
    Examples:
      |   namalengkap   |    nik      |usia|  nomortelepon   |    alamat    |
      |  Bagas Dwi S    |  1234479680 | 11 |   01294657612   |   Perumahan  |
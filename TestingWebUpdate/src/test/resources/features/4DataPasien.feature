#@DataPasien
#Feature: Data Pasien - Admin

#  @ViewPatientData
#  Scenario Outline: As a admin i want to view data pasien
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    When I click button login
#    And Login validation invalid
#    Then Click button data pasien
#    And View Patient data
#    Examples:
#      |email      |password   |
#      |admin      |admin123   |

#  @DetailPatientData
#  Scenario Outline: As a admin i want to detail data pasien
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    When I click button login
#    And Login validation invalid
#    Then Click button data pasien
#    And Click Detail Patient data
#    And Valid data detail pasien
#    Examples:
#      |   email   |password   |
#      |admin      |admin123   |

#  @AddPatientDataValid
#  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Valid
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button data pasien
#    And Click button tambah data
#    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin laki-laki
#    Then Click button simpan
#    And Valid data pasien
#    Examples:
#      | email  |password|namalengkap|nik|usia|nomortelepon|alamat|
#      |admin   |admin123|  Jhon Martin   | 1234567898979800 | 20 |   01294655361   |   perumahan  |
#
#  @AddPatientDataValidNoGender
#  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Valid not Gender
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button data pasien
#    And Click button tambah data
#    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    Then Click button simpan
#    And Validate add error messenger "<text>" Pasien
#    Examples:
#      | email  |password|namalengkap|         nik      |usia|   nomortelepon  |   alamat     |text|
#      |admin   |admin123|  st Bagas | 1234567898971053 | 20 |   01294657340   |   perumahan  ||

#  @EditPatientDataValid
#  Scenario Outline: As a admin i want to edit data pasien (JK Perempuan) - Valid
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button data pasien
#    And Click Detail Patient data
#    And Valid data detail pasien
#    And Click button edit profil
#    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin perempuan
#    And Click button simpan
#    And Valid edit data
#    Examples:
#      | email  |password|namalengkap|    nik        |usia|  nomortelepon   |    alamat    |
#      |admin   |admin123|   Materio |1234567891231155|32|085243272980    |  perumahan   |

#  @AddPatientDataKosong
#  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Kosong
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button data pasien
#    And Click button tambah data
#    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin laki-laki
#    Then Click button simpan
#    And Validate add error messenger "<text>" Pasien
#    Examples:
#      | email  |password|namalengkap|        nik       |usia|   nomortelepon  |    alamat    |text|
#      |admin   |admin123|           |                  |    |                 |              |    |
#      |admin   |admin123|           | 1234567898976546 | 20 |   01294657612   |   perumahan  |nama pasien perlu dibutuhkan|
#      |admin   |admin123|  Bagas    |                  | 11 |   01294657612   |   perumahan  |nik perlu dibutuhkan|
#      |admin   |admin123|  Bagas    | 1234567898976546 |    |  01294657612    |   perumahan  |umur tidak sesuai|
#      |admin   |admin123|  Bagas    | 1234567898976546 | 12 |                 |   perumahan  |nomor telpon perlu dibutuhkan|
#      |admin   |admin123|  Bagas    | 1234567898976546 | 13 |   01294657612   |              |alamat perlu dibutuhkan|
#
#  @AddPatientDataInvalid
#  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Invlid
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button data pasien
#    And Click button tambah data
#    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin laki-laki
#    Then Click button simpan
#    And Validate add error messenger "<text>" Pasien
#    Examples:
#      | email  |password|namalengkap|        nik       |usia|   nomortelepon  |    alamat    |text|
#      |admin   |admin123|  12345    | 1234567898976546 | 20 |   01294657612   |   perumahan  |nama pasien perlu dibutuhkan|
#      |admin   |admin123|  Bagas    | 123456789        | 11 |   01294657612   |   perumahan  |nik perlu dibutuhkan|
#      |admin   |admin123|  Bagas    | 1234567898976546 | e  |  01294657612    |   perumahan  |umur tidak sesuai|
#      |admin   |admin123|  Bagas    | 1234567898976546 | 12 |  bagasdwisap    |   perumahan  |nomor telpon perlu dibutuhkan|
#      |admin   |admin123|  Bagas    | 1234567898976546 | 13 |   01294657612   |   121323232  |alamat perlu dibutuhkan|

#  @EditPatientDataInvalid
#  Scenario Outline: As a admin i want to edit data pasien (JK Perempuan) - Invalid
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button data pasien
#    And Click Detail Patient data
#    And Valid data detail pasien
#    And Click button edit profil
#    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin perempuan
#    And Click button simpan
#    And Validate add error messenger "<text>" Pasien
#    Examples:
#      | email  |password|namalengkap|    nik           |usia|  nomortelepon   |    alamat    |text|
#      |admin   |admin123|   56712   |    11221212      | 1  |   jngasjgxbba   |   970194371  |    |
#      |admin   |admin123|  56712    | 1234567891234567 | 20 |   01294657612   |   perumahan  | hanya mengandung huruf |
#      |admin   |admin123|  Bagas    |     11221212     | 20 |   01294657612   |   perumahan  |  nik perlu 16 digit  |
#      |admin   |admin123|  Bagas    | 1234567891234567 | e  |  01294657612    |   perumahan  |    |
#      |admin   |admin123|  Bagas    | 1234567891234567 | 20 |   jngasjgxbba   |   perumahan  | nomor telpon harus berupa angka |

#  @NoDeletePatientData
#  Scenario Outline: As a admin i want to delete data pasien - No
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    When I click button login
#    And Login validation invalid
#    And Click button data pasien
#    Then Click Delete Patient data
#    And Click button hapus tidak
#    And Valid data delete pasien
#    Examples:
#      |   email   |password   |
#      |admin      |admin123   |
#
#  @YesDeletePatientData
#  Scenario Outline: As a admin i want to delete data pasien - Yes
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    When I click button login
#    And Login validation invalid
#    And Click button data pasien
#    Then Click Delete Patient data
#    And Click button hapus ya
#    And Valid data delete pasien
#    Examples:
#      |   email   |password   |
#      |admin      |admin123   |

#  @SearchPatientData
#  Scenario Outline: As a admin i want to search data pasien
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    When I click button login
#    And Login validation invalid
#    And Click button data pasien
#    Then Click search all category Patient data
#    And Click chose nama
#    And Input data "<namacategory>" category
#    And Valid data category pasien
#    Examples:
#      |   email   |password   | namacategory|
#      |admin      |admin123   |     bagas   |
#      |admin      |admin123   |  &%^%^*)%   |


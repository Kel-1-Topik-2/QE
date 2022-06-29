#@DataPasien
#Feature: Data Pasien - Admin
#
#  @ViewPatientData
#  Scenario: As a admin i want to view data pasien
#    Given Open page dasbord
#    When Click button data pasien
#    Then View Patient data
#
#  @DetailPatientData
#  Scenario: As a admin i want to detail data pasien
#    Given Open page data pasien
#    When Click Detail Patient data
#    Then Valid data detail pasien
#
#  @AddPatientData
#  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki)
#    Given Open page data pasien
#    When Click button tambah data
#    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin laki-laki
#    And Click button simpan
#    And Valid data pasien
#    Examples:
#      |namalengkap|nik|usia|nomortelepon|alamat|
#      |   Bagas   |  1234479680 | 20 |   01294657612   |   perumahan  |
#      |           |  1234479680 | 20 |   01294657612   |   perumahan  |
#      |  Bagas    |             | 20 |   01294657612   |   perumahan  |
#      |  Bagas    | 1234479680  |    |  01294657612    |   perumahan  |
#      |  Bagas    |  1234479680 | 20 |                 |   perumahan  |
#      |  Bagas    |  1234479680 | 20 |   01294657612   |              |
#
#  @AddPatientDataNoJK
#  Scenario Outline: As a admin i want to add data pasien but not gander
#    Given Open page data pasien
#    When Click button tambah data
#    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And Click button simpan
#    And Valid data pasien
#    Examples:
#      |namalengkap|nik|usia|nomortelepon|alamat|
#      |   Bagas   |  1234479680 | 20 |   01294657612   |   perumahan  |
#
#  @EditPatientData
#  Scenario Outline: As a admin i want to edit data pasien (JK Perempuan)
#    Given Open page data pasien
#    And Click Detail Patient data
#    When Valid data detail pasien
#    And Click button edit profil
#    Then I input edit "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin perempuan
#    And Click button simpan
#    And Valid edit data
#    Examples:
#      |namalengkap|    nik      |usia|  nomortelepon   |    alamat    |
#      |   56712   |  bGaSASUUQEW | ba |   jngasjgxbba   |   970194371  |
#      |  56712    |  1234479680 | 20 |   01294657612   |   perumahan  |
#      |  Bagas    |  bGaSASUUQE | 20 |   01294657612   |   perumahan  |
#      |  Bagas    | 1234479680  | ba |  01294657612    |   perumahan  |
#      |  Bagas    |  1234479680 | 20 |   jngasjgxbba   |   perumahan  |
#      |  Bagas    |  1234479680 | 20 |   01294657612   |   970194371  |
#
#  @YesDeletePatientData
#  Scenario: As a admin i want to delete data pasien
#    Given Open page data pasien
#    When Click Delete Patient data
#    Then Valid data delete pasien
#
#  @SearchPatientData
#  Scenario Outline: As a admin i want to search data pasien
#    Given Open page data pasien
#    And Click search all category Patient data
#    When Click chose nama
#    And Input data "<namacategory>" category
#    Then Valid data category pasien
#    Examples:
#      |namacategory|
#      |    bagas   |
#      |  &%^%^*)%  |

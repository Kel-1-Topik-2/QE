@AddPatientData
Feature: Add Data Pasien - Admin

  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) [Valid]
    Given Open page data pasien
    When Click button tambah data
    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin laki-laki
    And Click button simpan
    And Valid data pasien
    Examples:
    |namalengkap|      nik    |usia|   nomortelepon  |    alamat    |
    |   Bagas   |  1234479680 | 20 |   01294657612   |   Perumahan  |
    |           |             |    |                 |              |
    |           |  1234479680 | 11 |   01294657612   |   Perumahan  |
    |  Bagas    |             | 22 |   01294657612   |   Perumahan  |
    |  Bagas    | 1234479680  |    |  01294657612    |   Perumahan  |
    |  Bagas    |  1234479680 | 33 |                 |   Perumahan  |
    |  Bagas    |  1234479680 | 44 |   01294657612   |              |
    |   12345   |  1234479680 | 5  |   01294657612   |   Perumahan  |
    |   Bagas   |  Bagasdwis  | 6  |   01294657612   |   Perumahan  |
    |   Bagas   |  1234479680 | e  |   01294657612   |   Perumahan  |
    |   Bagas   |  1234479680 | 7  |   Perumahan     |   Perumahan  |
    |   Bagas   |  1234479680 | 8  |   01294657612   |  ./;'[]90978 |

#  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) [Invalid]
#    Given Open page data pasien
#    When Click button tambah data
#    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
#    And I click button jenis kelamin laki-laki
#    And Click button simpan
#    And Validate add error messenger "<text>" Pasien
#    Examples:
#      |namalengkap|      nik    |usia|   nomortelepon  |    alamat    | text   |
#      |           |             |    |                 |              | error  |
#      |           |  1234479680 | 11 |   01294657612   |   Perumahan  | error  |
#      |  Bagas    |             | 22 |   01294657612   |   Perumahan  | error  |
#      |  Bagas    | 1234479680  |    |  01294657612    |   Perumahan  | error  |
#      |  Bagas    |  1234479680 | 33 |                 |   Perumahan  | error  |
#      |  Bagas    |  1234479680 | 44 |   01294657612   |              | error  |
#      |   12345   |  1234479680 | 5  |   01294657612   |   Perumahan  | error  |
#      |   Bagas   |  Bagasdwis  | 6  |   01294657612   |   Perumahan  | error  |
#      |   Bagas   |  1234479680 | e  |   01294657612   |   Perumahan  | pass   |
#      |   Bagas   |  1234479680 | 7  |   Perumahan     |   Perumahan  | error  |
#      |   Bagas   |  1234479680 | 8  |   01294657612   |  ./;'[]90978 | error  |

  Scenario Outline: As a admin i want to add data pasien (JK Perempuan)
    Given Open page data pasien
    When Click button tambah data
    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin perempuan
    And Click button simpan
    And Valid data pasien
#    And Validate add error messenger "<text>" Pasien
    Examples:
      |namalengkap|      nik    |usia|   nomortelepon  |    alamat    |
      |   Bagas   |  1234479680 | 20 |   01294657612   |   Perumahan  |

  Scenario Outline: As a admin i want to add data pasien but not gander
    Given Open page data pasien
    When Click button tambah data
    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And Click button simpan
    And Valid data pasien
    Examples:
      |namalengkap|      nik    |usia|   nomortelepon  |    alamat    |
      |   Bagas   |  1234479680 | 53 |   01294657612   |   Perumahan  |
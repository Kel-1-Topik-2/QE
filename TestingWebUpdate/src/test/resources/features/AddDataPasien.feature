@AddPatientData
Feature: Add Data Pasien - Admin

#  Diubah Data valid namalengkap,nik,nomor
  @AddPatientDataValid
  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Valid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data pasien
    And Click button tambah data
    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin laki-laki
    Then Click button simpan
    And Valid data pasien
    Examples:
      | email  |password|namalengkap|nik|usia|nomortelepon|alamat|
      |admin   |admin123|  Dim Thomas   | 4442567898944714 | 15 |   08524654455   |   perumahan  |

  @AddPatientDataValidNoGender
  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Valid not Gender
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data pasien
    And Click button tambah data
    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    Then Click button simpan
    And Validate add error messenger "<text>" Pasien
    Examples:
      | email  |password|namalengkap|         nik      |usia|   nomortelepon  |   alamat     |text|
      |admin   |admin123|  ST Wogi ya  | 1234567898973324 | 32 |   08514653325   |   perumahan  ||

  @AddPatientDataKosong
  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Kosong
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data pasien
    And Click button tambah data
    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin laki-laki
    Then Click button simpan
    And Validate add error messenger "<text>" Pasien
    Examples:
      | email  |password|namalengkap|        nik       |usia|   nomortelepon  |    alamat    |text|
      |admin   |admin123|           |                  |    |                 |              |    |
      |admin   |admin123|           | 1234567898976546 | 20 |   01294657612   |   perumahan  |nama pasien perlu dibutuhkan|
      |admin   |admin123|  Bagas    |                  | 11 |   01294657612   |   perumahan  |nik perlu dibutuhkan|
      |admin   |admin123|  Bagas    | 1234567898976546 |    |  01294657612    |   perumahan  |umur tidak sesuai|
      |admin   |admin123|  Bagas    | 1234567898976546 | 12 |                 |   perumahan  |nomor telpon perlu dibutuhkan|
      |admin   |admin123|  Bagas    | 1234567898976546 | 13 |   01294657612   |              |alamat perlu dibutuhkan|

  @AddPatientDataInvalid
  Scenario Outline: As a admin i want to add data pasien (JK Laki-Laki) - Invalid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data pasien
    And Click button tambah data
    And I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin laki-laki
    Then Click button simpan
    And Validate add error messenger "<text>" Pasien
    Examples:
      | email  |password|namalengkap|        nik       |usia|   nomortelepon  |    alamat    |text|
      |admin   |admin123|  12345    | 1234567898976546 | 20 |   01294657612   |   perumahan  |nama pasien perlu dibutuhkan|
      |admin   |admin123|  Bagas    | 123456789        | 11 |   01294657612   |   perumahan  |nik perlu dibutuhkan|
      |admin   |admin123|  Bagas    | 1234567898976546 | e  |  01294657612    |   perumahan  |umur tidak sesuai|
      |admin   |admin123|  Bagas    | 1234567898976546 | 12 |  bagasdwisap    |   perumahan  |nomor telpon perlu dibutuhkan|
      |admin   |admin123|  Bagas    | 1234567898976546 | 13 |   01294657612   |   121323232  |alamat perlu dibutuhkan|

#@DataDokter
#Feature: Data Dokter Admin
#
#  @ViewDokterData
#  Scenario: As a admin i want to view data dokter
#    Given Open page dasbord
#    When Click button data dokter
#    Then View Dokter data
#
#  @DetailDokterData
#  Scenario: As a admin i want to detail data dokter
#    Given Open page data dokter
#    When Click Detail dokter data
#    Then Valid data detail dokter
#
#  @AddDokterData
#  Scenario Outline: As a admin i want to add data dokter
#    Given Open page data dokter
#    And Click button tambah data
#    When I input "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" dokter
#    Then Click button simpan
#    And Valid data dokter
#    And Validate add error messenger "<text>" dokter
#    Examples:
#      |namalengkap|idi|spesialis|username|pass|text|
#      |   Bagas   |  12344 | Dokter Gigi |   BagasBedah   |   BagasBedah  ||
#      |           |  12344 | Dokter Gigi |   BagasBedah   |   BagasBedah  |
#      |  Bagas    |        | Dokter Gigi |   BagasBedah   |   BagasBedah  |
#      |  Bagas    | 12344  |             |  BagasBedah    |   BagasBedah  |
#      |  Bagas    |  12344 | Dokter Gigi |                |   BagasBedah  |
#      |  Bagas    |  12344 | Dokter Gigi |   BagasBedah   |               |
#
#  @EditDokterData
#  Scenario Outline: As a admin i want to edit data dokter
#    Given Open page data dokter
#    And Click Detail dokter data
#    When Valid data detail dokter
#    And Click button edit profil
#    Then I input edit "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" dokter
#    And Click button simpan
#    And Valid edit data
#    Examples:
#      |namalengkap|idi|spesialis|username|pass|
#      |   21122   |  bagas | 00942534590 |   *Y*(^21333   |   *Y*(^21333  |
#      |   21122   |  12344 | Dokter Gigi |   BagasBedah   |   BagasBedah  |
#      |  Bagas    |  bagas | Dokter Gigi |   BagasBedah   |   BagasBedah  |
#      |  Bagas    | 12344  | 00990112122 |  BagasBedah    |   BagasBedah  |
#      |  Bagas    |  12344 | Dokter Gigi |   *Y*(^21333   |   BagasBedah  |
#      |  Bagas    |  12344 | Dokter Gigi |   BagasBedah   |   *Y*(^21333  |
#
#  @YesDeleteDokterData
#  Scenario: As a admin i want to delete data dokter
#    Given Open page data dokter
#    When Click Delete dokter data
#    Then Valid data delete dokter
#
#  @SearchDokterData
#  Scenario Outline: As a admin i want to delete data dokter
#    Given Open page data dokter
#    And Click search all category dokter data
#    When Click chose nama
#    And Input data "<namacategory>" category
#    Then Valid data category pasien
#    Examples:
#      |namacategory|
#      |    Bagas   |
##      |  &%^%^*)%  |

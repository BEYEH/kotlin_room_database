# Kotlin - Room Database

## Table of contents

- [Requirement](#requirement)
- [Architecture](#architecture)
- [Note](#note)
- [Resources](#resources)

## Requirement

- Device or an emulator with API level `26` or higher.

## Architecture

- View <-> ViewModel <-> Manager
- View <-> ViewModel <-> DAO <-> RoomDB
  - <img src="./images/room_architecture.png" width="50%">

## Note

- Store data from `in-memory` to `database`.
- Room
  - Room is a persistence library that's part of Android Jetpack.
  - Room is an abstraction layer on top of a SQLite database.
  - Three major components:
    - Database class
    - Data entities
    - Data access objects (DAOs)

## Resources

- [Room Database 🛢 in Android | Android Tutorial | 2024](https://www.youtube.com/watch?v=sWOmlDvz_3U&list=PLgpnJydBcnPA5aNrlDxxKWSqAma7m3OIl&index=8&ab_channel=EasyTuto)
- [Save data in a local database using Room](https://developer.android.com/training/data-storage/room)
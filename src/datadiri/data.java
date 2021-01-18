/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadiri;

import java.util.Scanner;

/**
 *
 * @author Yuliana
 */
public class data {
    String namalengkap, namapanggilan, jeniskelamin, ttl, agama, alamat, namaayah, namaibu, status;
    
    void isi(){
        Scanner input = new Scanner(System.in);
        System.out.println("============== MASUKKAN DATA DIRI ANDA ===============");
        System.out.print("Masukkan Nama Lengkap         : ");
        namalengkap = input.nextLine();
        System.out.print("Masukkan Nama Panggilan       : ");
        namapanggilan = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin        : ");
        jeniskelamin = input.nextLine();
        System.out.print("Masukkan Tempat Tanggal Lahir : ");
        ttl = input.nextLine();
        System.out.print("Masukkan Agama                : ");
        agama = input.nextLine();
        System.out.print("Masukkan Alamat               : ");
        alamat = input.nextLine();
        System.out.print("Masukkan Nama Ayah            : ");
        namaayah = input.nextLine();
        System.out.print("Masukkan Nama Ibu             : ");
        namaibu = input.nextLine();
        System.out.print("Masukkan Status               : ");
        status = input.nextLine();
    }
    
    void tampil(){
        System.out.println("");
        System.out.println("============== DATA DIRI ===============");
        System.out.println("Nama Lengkap            : "+namalengkap);
        System.out.println("Nama Panggilan          : "+namapanggilan);
        System.out.println("Jenis Kelamin           : "+jeniskelamin);
        System.out.println("Tempat & Tanggal Lahir  : "+ttl);
        System.out.println("Agama                   : "+agama);
        System.out.println("Alamat                  : "+alamat);
        System.out.println("Nama Ayah               : "+namaayah);
        System.out.println("Nama Ibu                : "+namaibu);
        System.out.println("Status                  : "+status);
    }
}

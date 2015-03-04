package com.ctu.app.utils; class Des { void a() { int a;
a=0;// .class public Lcom/ctu/app/utils/Des;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Des.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ctu/app/utils/Des;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static convertHexString(Ljava/lang/String;)[B
a=0;//     .locals 6
a=0;//     .param p0, "ss"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     new-array v2, v4, [B
a=0;// 
a=0;//     .line 57
a=0;//     .local v2, "digest":[B
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     if-ge v3, v4, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     mul-int/lit8 v4, v3, 0x2
a=0;// 
a=0;//     mul-int/lit8 v5, v3, 0x2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "byteString":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "byteValue":I
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v4, v1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v2, v3
a=0;// 
a=0;//     .line 57
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     .end local v0    # "byteString":Ljava/lang/String;
a=0;//     .end local v1    # "byteValue":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;//     .param p0, "message"    # Ljava/lang/String;
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-static {p0}, Lcom/ctu/app/utils/Des;->convertHexString(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 43
a=0;//     .local v0, "bytesrc":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const-string v7, "DES/CBC/PKCS5Padding"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 44
a=0;//     .local v1, "cipher":Ljavax/crypto/Cipher;
a=0;//     #v1=(Reference,Ljavax/crypto/Cipher;);
a=0;//     new-instance v2, Ljavax/crypto/spec/DESKeySpec;
a=0;// 
a=0;//     #v2=(UninitRef,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     const-string v7, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v2, v7}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V
a=0;// 
a=0;//     .line 45
a=0;//     .local v2, "desKeySpec":Ljavax/crypto/spec/DESKeySpec;
a=0;//     #v2=(Reference,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     const-string v7, "DES"
a=0;// 
a=0;//     invoke-static {v7}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 46
a=0;//     .local v4, "keyFactory":Ljavax/crypto/SecretKeyFactory;
a=0;//     #v4=(Reference,Ljavax/crypto/SecretKeyFactory;);
a=0;//     invoke-virtual {v4, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 47
a=0;//     .local v6, "secretKey":Ljavax/crypto/SecretKey;
a=0;//     #v6=(Reference,Ljavax/crypto/SecretKey;);
a=0;//     new-instance v3, Ljavax/crypto/spec/IvParameterSpec;
a=0;// 
a=0;//     #v3=(UninitRef,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const-string v7, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v3, v7}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
a=0;// 
a=0;//     .line 49
a=0;//     .local v3, "iv":Ljavax/crypto/spec/IvParameterSpec;
a=0;//     #v3=(Reference,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v1, v7, v6, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 52
a=0;//     .local v5, "retByte":[B
a=0;//     #v5=(Reference,[B);
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v8, "UTF-8"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v5, v8}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method public static encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "message"    # Ljava/lang/String;
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     const-string v5, "DES/CBC/PKCS5Padding"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 22
a=0;//     .local v0, "cipher":Ljavax/crypto/Cipher;
a=0;//     #v0=(Reference,Ljavax/crypto/Cipher;);
a=0;//     new-instance v1, Ljavax/crypto/spec/DESKeySpec;
a=0;// 
a=0;//     #v1=(UninitRef,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     const-string v5, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v1, v5}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V
a=0;// 
a=0;//     .line 24
a=0;//     .local v1, "desKeySpec":Ljavax/crypto/spec/DESKeySpec;
a=0;//     #v1=(Reference,Ljavax/crypto/spec/DESKeySpec;);
a=0;//     const-string v5, "DES"
a=0;// 
a=0;//     invoke-static {v5}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 25
a=0;//     .local v3, "keyFactory":Ljavax/crypto/SecretKeyFactory;
a=0;//     #v3=(Reference,Ljavax/crypto/SecretKeyFactory;);
a=0;//     invoke-virtual {v3, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 26
a=0;//     .local v4, "secretKey":Ljavax/crypto/SecretKey;
a=0;//     #v4=(Reference,Ljavax/crypto/SecretKey;);
a=0;//     new-instance v2, Ljavax/crypto/spec/IvParameterSpec;
a=0;// 
a=0;//     #v2=(UninitRef,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const-string v5, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v2, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
a=0;// 
a=0;//     .line 27
a=0;//     .local v2, "iv":Ljavax/crypto/spec/IvParameterSpec;
a=0;//     #v2=(Reference,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v0, v5, v4, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     .line 29
a=0;//     const-string v5, "UTF-8"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/ctu/app/utils/Des;->toHexString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     return-object v5
a=0;// .end method
a=0;// 
a=0;// .method public static main([Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p0, "args"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     const-string v0, "d11cac2f7bae414b24223d8042c53766"
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "old":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "12ctu3ap"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3}, Lcom/ctu/app/utils/Des;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 87
a=0;//     .local v1, "str":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\u52a0\u5bc6--->"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     const-string v3, "12345678"
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/ctu/app/utils/Des;->decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     .local v2, "str1":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\u89e3\u5bc6---->"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static toHexString([B)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "b"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "hexString":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     aget-byte v3, p0, v1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "plainText":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge v3, v4, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 68
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     .end local v2    # "plainText":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// .end method
}}

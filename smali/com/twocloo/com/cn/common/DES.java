package com.twocloo.com.cn.common; class DES { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/DES;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DES.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static iv:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/common/DES;->iv:[B
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x1t
a=0;//         0x2t
a=0;//         0x3t
a=0;//         0x4t
a=0;//         0x5t
a=0;//         0x6t
a=0;//         0x7t
a=0;//         0x8t
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/DES;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static decryptDES(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .param p0, "decryptString"    # Ljava/lang/String;
a=0;//     .param p1, "decryptKey"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v5, Lcom/twocloo/com/cn/common/Base64;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/common/Base64;);
a=0;//     invoke-direct {v5}, Lcom/twocloo/com/cn/common/Base64;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/Base64;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/Base64;->decode(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 26
a=0;//     .local v0, "byteMi":[B
a=0;//     #v0=(Reference,[B);
a=0;//     new-instance v4, Ljavax/crypto/spec/IvParameterSpec;
a=0;// 
a=0;//     #v4=(UninitRef,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/DES;->iv:[B
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
a=0;// 
a=0;//     .line 27
a=0;//     .local v4, "zeroIv":Ljavax/crypto/spec/IvParameterSpec;
a=0;//     #v4=(Reference,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     new-instance v3, Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v3=(UninitRef,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "DES"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 28
a=0;//     .local v3, "key":Ljavax/crypto/spec/SecretKeySpec;
a=0;//     #v3=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     const-string v5, "DES/CBC/PKCS5Padding"
a=0;// 
a=0;//     invoke-static {v5}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 29
a=0;//     .local v1, "cipher":Ljavax/crypto/Cipher;
a=0;//     #v1=(Reference,Ljavax/crypto/Cipher;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v1, v5, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     .line 30
a=0;//     invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 32
a=0;//     .local v2, "decryptedData":[B
a=0;//     #v2=(Reference,[B);
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v2}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     return-object v5
a=0;// .end method
a=0;// 
a=0;// .method public static encryptDES(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "encryptString"    # Ljava/lang/String;
a=0;//     .param p1, "encryptKey"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     new-instance v3, Ljavax/crypto/spec/IvParameterSpec;
a=0;// 
a=0;//     #v3=(UninitRef,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/DES;->iv:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
a=0;// 
a=0;//     .line 16
a=0;//     .local v3, "zeroIv":Ljavax/crypto/spec/IvParameterSpec;
a=0;//     #v3=(Reference,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     new-instance v2, Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v2=(UninitRef,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "DES"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 17
a=0;//     .local v2, "key":Ljavax/crypto/spec/SecretKeySpec;
a=0;//     #v2=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     const-string v4, "DES/CBC/PKCS5Padding"
a=0;// 
a=0;//     invoke-static {v4}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 18
a=0;//     .local v0, "cipher":Ljavax/crypto/Cipher;
a=0;//     #v0=(Reference,Ljavax/crypto/Cipher;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v4, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     .line 19
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-virtual {v0, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 21
a=0;//     .local v1, "encryptedData":[B
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/Base64;->encode([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// .end method
}}

package com.twocloo.base.util; class EncodeUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/EncodeUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EncodeUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HEX_DIGITS:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/base/util/EncodeUtils;->HEX_DIGITS:[C
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x30s
a=0;//         0x31s
a=0;//         0x32s
a=0;//         0x33s
a=0;//         0x34s
a=0;//         0x35s
a=0;//         0x36s
a=0;//         0x37s
a=0;//         0x38s
a=0;//         0x39s
a=0;//         0x61s
a=0;//         0x62s
a=0;//         0x63s
a=0;//         0x64s
a=0;//         0x65s
a=0;//         0x66s
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/EncodeUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static md5(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     :try_start_0
a=0;//     const-string v3, "MD5"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 21
a=0;//     .local v0, "digest":Ljava/security/MessageDigest;
a=0;//     #v0=(Reference,Ljava/security/MessageDigest;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 24
a=0;//     .local v2, "messageDigest":[B
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/EncodeUtils;->toHexString([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 29
a=0;//     .end local v0    # "digest":Ljava/security/MessageDigest;
a=0;//     .end local v2    # "messageDigest":[B
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 25
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 26
a=0;//     .local v1, "e":Ljava/security/NoSuchAlgorithmException;
a=0;//     #v1=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 29
a=0;//     const-string v3, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static toHexString([B)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "b"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 36
a=0;//     .local v1, "sb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     sget-object v2, Lcom/twocloo/base/util/EncodeUtils;->HEX_DIGITS:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xf0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     ushr-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v2, Lcom/twocloo/base/util/EncodeUtils;->HEX_DIGITS:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit8 v3, v3, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 36
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

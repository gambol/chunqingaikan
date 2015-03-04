package com.twocloo.com.cn.utils; class OtherUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/OtherUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OtherUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/OtherUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static md5(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     :try_start_0
a=0;//     const-string v3, "MD5"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 23
a=0;//     .local v0, "digest":Ljava/security/MessageDigest;
a=0;//     #v0=(Reference,Ljava/security/MessageDigest;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 26
a=0;//     .local v2, "messageDigest":[B
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/OtherUtils;->toHexString([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 30
a=0;//     .end local v0    # "digest":Ljava/security/MessageDigest;
a=0;//     .end local v2    # "messageDigest":[B
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 27
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 28
a=0;//     .local v1, "e":Ljava/security/NoSuchAlgorithmException;
a=0;//     #v1=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 30
a=0;//     const-string v3, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static randomNumber(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     new-instance v1, Ljava/util/Random;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v1}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     .local v1, "random":Ljava/util/Random;
a=0;//     #v1=(Reference,Ljava/util/Random;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "index":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v2=(PosByte);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static toHexString([B)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "bytes"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     .line 37
a=0;//     #v3=(PosByte);
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 38
a=0;//     .local v1, "sb":Ljava/lang/StringBuffer;
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit16 v2, v2, 0xf0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 40
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 38
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static transferCount(I)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-lt p0, v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     div-int/lit16 v1, p0, 0x2710
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u4e07"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosShort);v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

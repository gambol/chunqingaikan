package com.ctu.app.utils; class MD5 { void a() { int a;
a=0;// .class public Lcom/ctu/app/utils/MD5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MD5.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ctu/app/utils/MD5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getMD5(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;//     .param p0, "string"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     :try_start_0
a=0;//     const-string v7, "MD5"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "UTF-8"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/security/MessageDigest;->digest([B)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 22
a=0;//     .local v3, "hash":[B
a=0;//     #v3=(Reference,[B);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v7, v3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-int/lit8 v7, v7, 0x2
a=0;// 
a=0;//     invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 23
a=0;//     .local v4, "hex":Ljava/lang/StringBuilder;
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .local v0, "arr$":[B
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v5, v6, :cond_1
a=0;// 
a=0;//     aget-byte v1, v0, v5
a=0;// 
a=0;//     .line 24
a=0;//     .local v1, "b":B
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v7, v1, 0xff
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0x10
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ge v7, v8, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     const-string v7, "0"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 26
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     and-int/lit16 v7, v1, 0xff
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 23
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 16
a=0;//     .end local v0    # "arr$":[B
a=0;//     .end local v1    # "b":B
a=0;//     .end local v3    # "hash":[B
a=0;//     .end local v4    # "hex":Ljava/lang/StringBuilder;
a=0;//     .end local v5    # "i$":I
a=0;//     .end local v6    # "len$":I
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 17
a=0;//     .local v2, "e":Ljava/security/NoSuchAlgorithmException;
a=0;//     #v2=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     new-instance v7, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v8, "Huh, MD5 should be supported?"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 18
a=0;//     .end local v2    # "e":Ljava/security/NoSuchAlgorithmException;
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 19
a=0;//     .local v2, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v2=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v7, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v8, "Huh, UTF-8 should be supported?"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 28
a=0;//     .end local v2    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     .restart local v0    # "arr$":[B
a=0;//     .restart local v3    # "hash":[B
a=0;//     .restart local v4    # "hex":Ljava/lang/StringBuilder;
a=0;//     .restart local v5    # "i$":I
a=0;//     .restart local v6    # "len$":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Uninit);v3=(Reference,[B);v4=(Reference,Ljava/lang/StringBuilder;);v5=(Integer);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     return-object v7
a=0;// .end method
}}

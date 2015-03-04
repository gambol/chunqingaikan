package com.twocloo.base.alipay; class Rsa { void a() { int a;
a=0;// .class public Lcom/twocloo/base/alipay/Rsa;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Rsa.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final SIGN_ALGORITHMS:Ljava/lang/String; = "SHA1WithRSA"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/Rsa;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static doCheck(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 9
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "sign"    # Ljava/lang/String;
a=0;//     .param p2, "publicKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     :try_start_0
a=0;//     sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "\u9a8c\u8bc1\u5185\u5bb9\uff1a"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     const-string v6, "RSA"
a=0;// 
a=0;//     invoke-static {v6}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 80
a=0;//     .local v3, "keyFactory":Ljava/security/KeyFactory;
a=0;//     #v3=(Reference,Ljava/security/KeyFactory;);
a=0;//     invoke-static {p2}, Lcom/twocloo/base/alipay/Base64;->decode(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 81
a=0;//     .local v2, "encodedKey":[B
a=0;//     #v2=(Reference,[B);
a=0;//     new-instance v6, Ljava/security/spec/X509EncodedKeySpec;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/security/spec/X509EncodedKeySpec;);
a=0;//     invoke-direct {v6, v2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/security/spec/X509EncodedKeySpec;);
a=0;//     invoke-virtual {v3, v6}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 83
a=0;//     .local v4, "pubKey":Ljava/security/PublicKey;
a=0;//     #v4=(Reference,Ljava/security/PublicKey;);
a=0;//     const-string v6, "SHA1WithRSA"
a=0;// 
a=0;//     invoke-static {v6}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 85
a=0;//     .local v5, "signature":Ljava/security/Signature;
a=0;//     #v5=(Reference,Ljava/security/Signature;);
a=0;//     invoke-virtual {v5, v4}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
a=0;// 
a=0;//     .line 86
a=0;//     const-string v6, "utf-8"
a=0;// 
a=0;//     invoke-virtual {p0, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/security/Signature;->update([B)V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {p1}, Lcom/twocloo/base/alipay/Base64;->decode(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/security/Signature;->verify([B)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 95
a=0;//     .end local v2    # "encodedKey":[B
a=0;//     .end local v3    # "keyFactory":Ljava/security/KeyFactory;
a=0;//     .end local v4    # "pubKey":Ljava/security/PublicKey;
a=0;//     .end local v5    # "signature":Ljava/security/Signature;
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 91
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 92
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static sign(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "privateKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     const-string v0, "utf-8"
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "charset":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/security/spec/PKCS8EncodedKeySpec;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/security/spec/PKCS8EncodedKeySpec;);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/alipay/Base64;->decode(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     invoke-direct {v4, v7}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V
a=0;// 
a=0;//     .line 58
a=0;//     .local v4, "priPKCS8":Ljava/security/spec/PKCS8EncodedKeySpec;
a=0;//     #v4=(Reference,Ljava/security/spec/PKCS8EncodedKeySpec;);
a=0;//     const-string v7, "RSA"
a=0;// 
a=0;//     invoke-static {v7}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "keyf":Ljava/security/KeyFactory;
a=0;//     #v2=(Reference,Ljava/security/KeyFactory;);
a=0;//     invoke-virtual {v2, v4}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 61
a=0;//     .local v3, "priKey":Ljava/security/PrivateKey;
a=0;//     #v3=(Reference,Ljava/security/PrivateKey;);
a=0;//     const-string v7, "SHA1WithRSA"
a=0;// 
a=0;//     invoke-static {v7}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 63
a=0;//     .local v5, "signature":Ljava/security/Signature;
a=0;//     #v5=(Reference,Ljava/security/Signature;);
a=0;//     invoke-virtual {v5, v3}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/security/Signature;->update([B)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {v5}, Ljava/security/Signature;->sign()[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 68
a=0;//     .local v6, "signed":[B
a=0;//     #v6=(Reference,[B);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/alipay/Base64;->encode([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 73
a=0;//     .end local v2    # "keyf":Ljava/security/KeyFactory;
a=0;//     .end local v3    # "priKey":Ljava/security/PrivateKey;
a=0;//     .end local v4    # "priPKCS8":Ljava/security/spec/PKCS8EncodedKeySpec;
a=0;//     .end local v5    # "signature":Ljava/security/Signature;
a=0;//     .end local v6    # "signed":[B
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 69
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 70
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 73
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}

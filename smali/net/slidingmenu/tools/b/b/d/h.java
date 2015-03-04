package net.slidingmenu.tools.b.b.d; class h { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/d/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1, p1, p2}, Lnet/slidingmenu/tools/b/b/d/h;->a([BLjava/lang/String;[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/a;->a([B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)Ljava/security/Key;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljavax/crypto/spec/PBEKeySpec;
a=0;// 
a=0;//     #v0=(UninitRef,Ljavax/crypto/spec/PBEKeySpec;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     invoke-direct {v0, v1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V
a=0;// 
a=0;//     #v0=(Reference,Ljavax/crypto/spec/PBEKeySpec;);
a=0;//     const-string v1, "PBEWITHMD5andDES"
a=0;// 
a=0;//     invoke-static {v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a()[B
a=0;//     .locals 2
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     new-instance v1, Ljava/util/Random;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v1}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a([BLjava/lang/String;[B)[B
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/d/h;->a(Ljava/lang/String;)Ljava/security/Key;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/Key;);
a=0;//     new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;
a=0;// 
a=0;//     #v1=(UninitRef,Ljavax/crypto/spec/PBEParameterSpec;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, p2, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V
a=0;// 
a=0;//     #v1=(Reference,Ljavax/crypto/spec/PBEParameterSpec;);
a=0;//     const-string v2, "PBEWITHMD5andDES"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v3, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/d/a;->b([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1, p2}, Lnet/slidingmenu/tools/b/b/d/h;->b([BLjava/lang/String;[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b([BLjava/lang/String;[B)[B
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/d/h;->a(Ljava/lang/String;)Ljava/security/Key;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/Key;);
a=0;//     new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;
a=0;// 
a=0;//     #v1=(UninitRef,Ljavax/crypto/spec/PBEParameterSpec;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, p2, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V
a=0;// 
a=0;//     #v1=(Reference,Ljavax/crypto/spec/PBEParameterSpec;);
a=0;//     const-string v2, "PBEWITHMD5andDES"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}

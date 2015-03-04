package com.chinaMobile; class d { void a() { int a;
a=0;// .class final Lcom/chinaMobile/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/chinaMobile/d;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/chinaMobile/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/chinaMobile/d;);
a=0;//     invoke-direct {v0}, Lcom/chinaMobile/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/chinaMobile/d;);
a=0;//     sput-object v0, Lcom/chinaMobile/d;->a:Lcom/chinaMobile/d;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/chinaMobile/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/chinaMobile/d;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/chinaMobile/d;->a:Lcom/chinaMobile/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/chinaMobile/d;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Ljava/lang/String;)[B
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v0, Ljava/util/zip/GZIPOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/zip/GZIPOutputStream;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/zip/GZIPOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)[B
a=0;//     .locals 4
a=0;// 
a=0;//     const-string v0, "134e3265829ff82daf16e7b740a600b5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/chinaMobile/d;->b:Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v1=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v2, v0, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     if-lt v0, v3, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v0=(UninitRef,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     const-string v1, "AES"
a=0;// 
a=0;//     invoke-direct {v0, v2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     iput-object v0, p0, Lcom/chinaMobile/d;->b:Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "AES/CBC/PKCS5Padding"
a=0;// 
a=0;//     invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljavax/crypto/spec/IvParameterSpec;
a=0;// 
a=0;//     #v1=(UninitRef,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const-string v2, "0102030405060708"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
a=0;// 
a=0;//     #v1=(Reference,Ljavax/crypto/spec/IvParameterSpec;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-object v3, p0, Lcom/chinaMobile/d;->b:Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v3=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     invoke-virtual {v0, v2, v3, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/chinaMobile/h;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/chinaMobile/h;);
a=0;//     invoke-direct {v1}, Lcom/chinaMobile/h;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/chinaMobile/h;);
a=0;//     invoke-virtual {v1, v0}, Lcom/chinaMobile/h;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/chinaMobile/d;->b(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Reference,[B);v3=(Integer);
a=0;//     aget-byte v3, v1, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v2, v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

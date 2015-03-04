package com.ccit.mmwlan.util; class Base64 { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/util/Base64;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Base64.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     new-instance v0, Lcom/ccit/mmwlan/util/Base64Encoder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/util/Base64Encoder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/util/Base64;->encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;//     .line 7
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 7
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/util/Base64;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static decode(Ljava/lang/String;Ljava/io/OutputStream;)I
a=0;//     .locals 1
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     sget-object v0, Lcom/ccit/mmwlan/util/Base64;->encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/Encoder;);
a=0;//     invoke-interface {v0, p0, p1}, Lcom/ccit/mmwlan/util/Encoder;->decode(Ljava/lang/String;Ljava/io/OutputStream;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static decode(Ljava/lang/String;)[B
a=0;//     .locals 6
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     mul-int/lit8 v2, v3, 0x3
a=0;// 
a=0;//     .line 94
a=0;//     .local v2, "len":I
a=0;//     #v2=(Integer);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "bOut":Ljava/io/ByteArrayOutputStream;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/util/Base64;->encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/util/Encoder;);
a=0;//     invoke-interface {v3, p0, v0}, Lcom/ccit/mmwlan/util/Encoder;->decode(Ljava/lang/String;Ljava/io/OutputStream;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 100
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 102
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "exception decoding base64 string: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public static decode([B)[B
a=0;//     .locals 6
a=0;//     .param p0, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     mul-int/lit8 v2, v3, 0x3
a=0;// 
a=0;//     .line 71
a=0;//     .local v2, "len":I
a=0;//     #v2=(Integer);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     .line 75
a=0;//     .local v0, "bOut":Ljava/io/ByteArrayOutputStream;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/util/Base64;->encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/util/Encoder;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v3, p0, v4, v5, v0}, Lcom/ccit/mmwlan/util/Encoder;->decode([BIILjava/io/OutputStream;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 77
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 79
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "exception decoding base64 string: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public static encode([BIILjava/io/OutputStream;)I
a=0;//     .locals 1
a=0;//     .param p0, "data"    # [B
a=0;//     .param p1, "off"    # I
a=0;//     .param p2, "length"    # I
a=0;//     .param p3, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     sget-object v0, Lcom/ccit/mmwlan/util/Base64;->encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/Encoder;);
a=0;//     invoke-interface {v0, p0, p1, p2, p3}, Lcom/ccit/mmwlan/util/Encoder;->encode([BIILjava/io/OutputStream;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static encode([BLjava/io/OutputStream;)I
a=0;//     .locals 3
a=0;//     .param p0, "data"    # [B
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/ccit/mmwlan/util/Base64;->encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/Encoder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, p0, v1, v2, p1}, Lcom/ccit/mmwlan/util/Encoder;->encode([BIILjava/io/OutputStream;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static encode([B)[B
a=0;//     .locals 6
a=0;//     .param p0, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     div-int/lit8 v3, v3, 0x3
a=0;// 
a=0;//     mul-int/lit8 v2, v3, 0x4
a=0;// 
a=0;//     .line 20
a=0;//     .local v2, "len":I
a=0;//     #v2=(Integer);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     .line 24
a=0;//     .local v0, "bOut":Ljava/io/ByteArrayOutputStream;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/util/Base64;->encoder:Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/util/Encoder;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v3, p0, v4, v5, v0}, Lcom/ccit/mmwlan/util/Encoder;->encode([BIILjava/io/OutputStream;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 26
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 28
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "exception encoding base64 string: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// .end method
}}

package com.tencent.a.b; class j { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/j;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "MD5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Conflicted);
a=0;//     if-ge v0, v4, :cond_0
a=0;// 
a=0;//     aget-byte v5, v1, v0
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     and-int/lit16 v5, v5, 0xff
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)[B
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v2, Ljava/util/zip/DeflaterOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/DeflaterOutputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/zip/DeflaterOutputStream;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     array-length v4, p0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, p0, v3, v4}, Ljava/util/zip/DeflaterOutputStream;->write([BII)V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->finish()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b([B)[B
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,[B);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v4, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v5, Ljava/util/zip/InflaterInputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/zip/InflaterInputStream;);
a=0;//     invoke-direct {v5, v4}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/zip/InflaterInputStream;);
a=0;//     new-array v2, v0, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v6, v1, [B
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Conflicted);v6=(Reference,[B);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v5, v6}, Ljava/util/zip/InflaterInputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lez v7, :cond_2
a=0;// 
a=0;//     add-int/2addr v0, v7
a=0;// 
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     array-length v10, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v2, v8, v1, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v6, v8, v1, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-gtz v7, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayInputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/zip/InflaterInputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Integer);v1=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,[B);v7=(Integer);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     goto :goto_2
a=0;// .end method
}}

package com.tencent.a.b; class q { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/q;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I
a=0;// 
a=0;// .field private static b:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/tencent/a/b/q;->a:I
a=0;// 
a=0;//     .line 18
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/net/HttpURLConnection;Z)Lcom/tencent/a/b/n;
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 241
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 243
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Lcom/tencent/a/b/n;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/a/b/n;);
a=0;//     invoke-direct {v5}, Lcom/tencent/a/b/n;-><init>()V
a=0;// 
a=0;//     .line 244
a=0;//     #v5=(Reference,Lcom/tencent/a/b/n;);
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 245
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "GBK"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/String;);
a=0;//     array-length v8, v7
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Integer);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-lt v4, v8, :cond_6
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iput-object v3, v5, Lcom/tencent/a/b/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 246
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 247
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     const-string v3, "vnd.wap.wml"
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     .line 253
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 254
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 256
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iput-object v2, v5, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     .line 258
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     .line 261
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Reference,[B);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 262
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 263
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     .line 264
a=0;//     new-array v4, v0, [B
a=0;// 
a=0;//     .line 265
a=0;//     #v4=(Reference,[B);
a=0;//     iget-object v6, v5, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     iget-object v9, v5, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     #v9=(Reference,[B);
a=0;//     array-length v9, v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v6, v7, v4, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 266
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v7, v5, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v2, v6, v4, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 267
a=0;//     iput-object v4, v5, Lcom/tencent/a/b/n;->a:[B
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 269
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-gtz v3, :cond_2
a=0;// 
a=0;//     .line 273
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 275
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 271
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 245
a=0;//     :cond_6
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Null);v2=(One);v3=(Reference,Ljava/lang/String;);v4=(Integer);v7=(Reference,[Ljava/lang/String;);v8=(Integer);
a=0;//     aget-object v9, v7, v4
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const-string v10, "charset"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_7
a=0;// 
a=0;//     const-string v4, "="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     array-length v7, v4
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-le v7, v2, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-object v3, v4, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v4=(Integer);v7=(Reference,[Ljava/lang/String;);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 247
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 272
a=0;//     :catchall_0
a=0;//     #v0=(Integer);v1=(Reference,Ljava/io/InputStream;);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 273
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 275
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     .line 279
a=0;//     :cond_9
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Integer);v5=(Reference,Lcom/tencent/a/b/n;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZZ)Lcom/tencent/a/b/n;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->d()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v0, Lcom/tencent/a/b/r;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/r;);
a=0;//     invoke-direct {v0}, Lcom/tencent/a/b/r;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/r;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, p6}, Lcom/tencent/a/b/q;->a(Ljava/lang/String;Z)Ljava/net/HttpURLConnection;
a=0;//     :try_end_0
a=0;//     .catch Lcom/tencent/a/b/p; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_2
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 161
a=0;//     #v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4}, Lcom/tencent/a/b/b;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 163
a=0;//     invoke-static {v4}, Lcom/tencent/a/b/b;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz p0, :cond_b
a=0;// 
a=0;//     .line 171
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 175
a=0;//     :goto_1
a=0;//     invoke-static {}, Lcom/tencent/a/b/k;->a()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 176
a=0;//     invoke-static {}, Lcom/tencent/a/b/k;->b()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 177
a=0;//     const-string v4, "User-Agent"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 178
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 179
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v3, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 180
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v3, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 181
a=0;//     if-eqz p5, :cond_3
a=0;// 
a=0;//     .line 182
a=0;//     const-string v2, "Connection"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Keep-Alive"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 185
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {v3}, Lcom/tencent/a/b/k;->a(Ljava/net/HttpURLConnection;)V
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     .line 187
a=0;//     invoke-static {}, Lcom/tencent/a/b/k;->c()V
a=0;// 
a=0;//     .line 189
a=0;//     if-nez p0, :cond_4
a=0;// 
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     array-length v2, p4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v2, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Lcom/tencent/a/b/p; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 191
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {v2, p4}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Lcom/tencent/a/b/p; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_3
a=0;// 
a=0;//     .line 196
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 198
a=0;//     #v2=(Integer);
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-eq v2, v4, :cond_5
a=0;// 
a=0;//     .line 199
a=0;//     const/16 v4, 0xce
a=0;// 
a=0;//     if-ne v2, v4, :cond_c
a=0;// 
a=0;//     .line 200
a=0;//     :cond_5
a=0;//     invoke-static {}, Lcom/tencent/a/b/k;->d()V
a=0;// 
a=0;//     .line 201
a=0;//     invoke-static {v3, p0}, Lcom/tencent/a/b/q;->a(Ljava/net/HttpURLConnection;Z)Lcom/tencent/a/b/n;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 202
a=0;//     #v2=(Reference,Lcom/tencent/a/b/n;);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     iget-object v4, v2, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     iget-object v0, v2, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/k;->a(I)V
a=0;//     :try_end_3
a=0;//     .catch Lcom/tencent/a/b/p; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 227
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 205
a=0;//     :cond_7
a=0;//     return-object v2
a=0;// 
a=0;//     .line 167
a=0;//     :cond_8
a=0;//     :try_start_4
a=0;//     #v0=(Null);v2=(One);v4=(Boolean);v5=(Uninit);
a=0;//     const-string v4, "Host"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_4
a=0;//     .catch Lcom/tencent/a/b/p; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/p;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 221
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);v2=(Reference,Ljava/net/HttpURLConnection;);v3=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :try_start_5
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Lcom/tencent/a/b/k;->a(Z)V
a=0;// 
a=0;//     .line 222
a=0;//     throw v0
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 226
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 227
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 228
a=0;//     invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     .line 230
a=0;//     :cond_9
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 233
a=0;//     :cond_a
a=0;//     throw v0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_b
a=0;//     :try_start_6
a=0;//     #v0=(Null);v1=(Null);v2=(One);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;//     :try_end_6
a=0;//     .catch Lcom/tencent/a/b/p; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 223
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 224
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_7
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/k;->a(Z)V
a=0;// 
a=0;//     .line 225
a=0;//     throw v0
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .line 226
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 206
a=0;//     :cond_c
a=0;//     #v0=(Null);v1=(Null);v2=(Integer);v4=(PosShort);
a=0;//     const/16 v0, 0xca
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 207
a=0;//     const/16 v0, 0xc9
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 208
a=0;//     const/16 v0, 0xcc
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 209
a=0;//     const/16 v0, 0xcd
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 210
a=0;//     const/16 v0, 0x130
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 211
a=0;//     const/16 v0, 0x131
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 212
a=0;//     const/16 v0, 0x198
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 213
a=0;//     const/16 v0, 0x1f6
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 214
a=0;//     const/16 v0, 0x1f8
a=0;// 
a=0;//     if-eq v2, v0, :cond_d
a=0;// 
a=0;//     .line 215
a=0;//     const/16 v0, 0x1f7
a=0;// 
a=0;//     if-ne v2, v0, :cond_e
a=0;// 
a=0;//     .line 216
a=0;//     :cond_d
a=0;//     :try_start_8
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v2, "doGetOrPost retry"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 218
a=0;//     :cond_e
a=0;//     #v0=(PosShort);v2=(Integer);
a=0;//     new-instance v0, Lcom/tencent/a/b/p;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/p;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "response code is "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/a/b/p;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/p;);
a=0;//     throw v0
a=0;//     :try_end_8
a=0;//     .catch Lcom/tencent/a/b/p; {:try_start_8 .. :try_end_8} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     .line 226
a=0;//     :catchall_2
a=0;//     #v0=(Null);v2=(One);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Null);v2=(Reference,Ljava/io/DataOutputStream;);v3=(Reference,Ljava/net/HttpURLConnection;);v4=(Reference,Ljava/io/OutputStream;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 223
a=0;//     :catch_2
a=0;//     #v0=(Null);v1=(Null);v2=(One);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Null);v2=(Reference,Ljava/io/DataOutputStream;);v3=(Reference,Ljava/net/HttpURLConnection;);v4=(Reference,Ljava/io/OutputStream;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 220
a=0;//     :catch_4
a=0;//     #v0=(Null);v1=(Null);v2=(One);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/p;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Null);v2=(Reference,Ljava/io/DataOutputStream;);v3=(Reference,Ljava/net/HttpURLConnection;);v4=(Reference,Ljava/io/OutputStream;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/p;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Z)Ljava/net/HttpURLConnection;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v4, Ljava/net/URL;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 59
a=0;//     #v4=(Reference,Ljava/net/URL;);
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     :try_start_1
a=0;//     invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 85
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 53
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Null);v3=(One);v5=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Ljava/net/MalformedURLException;);
a=0;//     invoke-virtual {v0}, Ljava/net/MalformedURLException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 55
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v4=(Reference,Ljava/net/URL;);
a=0;//     invoke-static {}, Lcom/tencent/a/b/m;->a()Lcom/tencent/a/b/m;
a=0;// 
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/b;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 63
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 69
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     sget v0, Lcom/tencent/a/b/q;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 71
a=0;//     sget-boolean v0, Lcom/tencent/a/b/q;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     sput-boolean v3, Lcom/tencent/a/b/q;->b:Z
a=0;// 
a=0;//     :try_start_2
a=0;//     new-instance v3, Ljava/net/URL;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/URL;);
a=0;//     const-string v0, "http://ls.map.soso.com/monitor/monitor.html"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URL;);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v6, :cond_3
a=0;// 
a=0;//     const/16 v0, 0x50
a=0;// 
a=0;//     :cond_3
a=0;//     new-instance v5, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v5, v2, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     new-instance v0, Ljava/net/Proxy;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     invoke-direct {v0, v2, v5}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {v3, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     const/16 v2, 0x3a98
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     const v2, 0xafc8
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     const-string v2, "User-Agent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "QQ Map Mobile"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/q;->a(Ljava/net/HttpURLConnection;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/q;->a(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(PosByte);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 76
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     :try_start_5
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     sget v0, Lcom/tencent/a/b/q;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v0, v6, :cond_5
a=0;// 
a=0;//     const/16 v0, 0x50
a=0;// 
a=0;//     :cond_5
a=0;//     new-instance v3, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v3, v2, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     new-instance v0, Ljava/net/Proxy;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     invoke-direct {v0, v2, v3}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {v4, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 71
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Conflicted);v5=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/MalformedURLException;);
a=0;//     sput-boolean v2, Lcom/tencent/a/b/q;->b:Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     :try_start_6
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/q;->a(I)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_7
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/q;->a(I)V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);v2=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     :cond_7
a=0;//     throw v0
a=0;// 
a=0;//     .line 78
a=0;//     :pswitch_0
a=0;//     :try_start_8
a=0;//     #v0=(Integer);v1=(Null);v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v4, p0}, Lcom/tencent/a/b/q;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 83
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 85
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 71
a=0;//     :catchall_1
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);v3=(Reference,Ujava/lang/Object;);v5=(Reference,Ljava/net/InetSocketAddress;);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v7, v1
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Reference,Ljava/net/HttpURLConnection;);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v1=(Null);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 76
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x50
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     .line 422
a=0;//     #v6=(Byte);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 423
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 424
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 428
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 429
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/net/URL;->getPort()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 430
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v6, :cond_2
a=0;// 
a=0;//     .line 435
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ":"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v6, :cond_1
a=0;// 
a=0;//     .line 436
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ":"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 443
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/net/URL;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 448
a=0;//     #v2=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 450
a=0;//     const-string v2, "X-Online-Host"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, ":"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 452
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 438
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v4, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 445
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Integer);v5=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     sget v0, Lcom/tencent/a/b/q;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     sput p0, Lcom/tencent/a/b/q;->a:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/net/HttpURLConnection;)Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 389
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 390
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 393
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "text/html"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 406
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 394
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 404
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 397
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 398
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_3
a=0;// 
a=0;//     .line 402
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 403
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 404
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 399
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 405
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 406
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 409
a=0;//     :cond_4
a=0;//     throw v0
a=0;// .end method
}}

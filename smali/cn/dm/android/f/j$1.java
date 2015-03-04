package cn.dm.android.f; class j$1 { void a() { int a;
a=0;// .class final Lcn/dm/android/f/j$1;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcn/dm/android/f/j;->a(Landroid/content/Context;Ljava/lang/String;Lcn/dm/android/f/j$a;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         "Ljava/lang/String;",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic c:Lcn/dm/android/f/j$a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcn/dm/android/f/j$a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iput-object p1, p0, Lcn/dm/android/f/j$1;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/dm/android/f/j$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/dm/android/f/j$1;->c:Lcn/dm/android/f/j$a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/f/j$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/String;)Ljava/lang/Boolean;
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcn/dm/android/f/j$1;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 147
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/dm/android/f/j$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/f/j;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 148
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Lcn/dm/android/f/j$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 149
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget-object v4, v0, v1
a=0;// 
a=0;//     .line 150
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v1, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     iget-object v5, p0, Lcn/dm/android/f/j$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-static {}, Lcn/dm/android/f/j;->a()Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Start download zip file:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcn/dm/android/f/j$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     invoke-interface {v0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 155
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 156
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 158
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     .line 159
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     #v0=(Null);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 162
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 163
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v8, v1, [B
a=0;// 
a=0;//     .line 165
a=0;//     #v8=(Reference,[B);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
a=0;//     #v1=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     invoke-virtual {v5, v8}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-eq v9, v10, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     add-int/2addr v1, v9
a=0;// 
a=0;//     .line 168
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     new-array v10, v10, [Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, ""
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     mul-int/lit8 v13, v1, 0x64
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-long v13, v13
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     div-long/2addr v13, v6
a=0;// 
a=0;//     long-to-int v13, v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     invoke-virtual {p0, v10}, Lcn/dm/android/f/j$1;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 170
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v0, v8, v10, v9}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 189
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     invoke-static {}, Lcn/dm/android/f/j;->a()Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 190
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 198
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Null);v5=(Reference,Ljava/io/InputStream;);v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {}, Lcn/dm/android/f/j;->a()Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Finish download zip file:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcn/dm/android/f/j$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     .line 175
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     new-instance v0, Lcn/dm/android/f/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/j;);
a=0;//     invoke-direct {v0}, Lcn/dm/android/f/j;-><init>()V
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Reference,Lcn/dm/android/f/j;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/f/j;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcn/dm/android/f/j$1;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "template_vn"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcn/dm/android/b/b;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 183
a=0;//     invoke-static {}, Lcn/dm/android/f/j;->a()Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Update version :"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 198
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 185
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcn/dm/android/f/j;->a()Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "UnZip fail :"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_2
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 191
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 192
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {}, Lcn/dm/android/f/j;->a()Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 193
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 194
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lcn/dm/android/f/j;->a()Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 196
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/Boolean;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcn/dm/android/f/j$1;->c:Lcn/dm/android/f/j$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/j$a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v0, p0, Lcn/dm/android/f/j$1;->c:Lcn/dm/android/f/j$a;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-interface {v0, v1}, Lcn/dm/android/f/j$a;->a(Z)V
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected varargs b([Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcn/dm/android/f/j$1;->c:Lcn/dm/android/f/j$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/j$a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcn/dm/android/f/j$1;->c:Lcn/dm/android/f/j$a;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcn/dm/android/f/j$a;->a([Ljava/lang/String;)V
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     .end local p1    # "x0":[Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Lcn/dm/android/f/j$1;->a([Ljava/lang/String;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Lcn/dm/android/f/j$1;->a(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     .end local p1    # "x0":[Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Lcn/dm/android/f/j$1;->b([Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}

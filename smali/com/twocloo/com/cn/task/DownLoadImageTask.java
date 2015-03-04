package com.twocloo.com.cn.task; class DownLoadImageTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/DownLoadImageTask;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "DownLoadImageTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Landroid/graphics/drawable/Drawable;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;// .field ctx:Landroid/content/Context;
a=0;// 
a=0;// .field imageView:Landroid/widget/Button;
a=0;// 
a=0;// .field url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/twocloo/com/cn/beans/BFBook;Landroid/widget/Button;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "book"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .param p3, "imageView"    # Landroid/widget/Button;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/DownLoadImageTask;);
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->imageView:Landroid/widget/Button;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs doInBackground([Ljava/lang/Void;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 15
a=0;//     .param p1, "arg0"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iput-object v10, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     const-string v11, ""
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Landroid/graphics/drawable/Drawable;);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 49
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Boolean);v11=(Reference,Ljava/lang/String;);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     const-string v9, ""
a=0;// 
a=0;//     .line 50
a=0;//     .local v9, "urlPath":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     .local v8, "uri":Landroid/net/Uri;
a=0;//     #v8=(Null);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v10, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     .local v1, "cacheFile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v4, v1, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 58
a=0;//     .local v4, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 80
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Landroid/net/Uri;);v10=(Byte);v11=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v12, 0xa
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v10, v10, v12
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_7
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v10=(Boolean);v11=(Reference,Ljava/lang/String;);v12=(Uninit);v13=(Uninit);
a=0;//     new-instance v7, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v7, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 62
a=0;//     .local v7, "outStream":Ljava/io/FileOutputStream;
a=0;//     #v7=(Reference,Ljava/io/FileOutputStream;);
a=0;//     new-instance v10, Ljava/net/URL;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v10, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 63
a=0;//     .local v2, "conn":Ljava/net/HttpURLConnection;
a=0;//     const/16 v10, 0x2710
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     invoke-virtual {v2, v10}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/16 v11, 0xc8
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     if-ne v10, v11, :cond_4
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 66
a=0;//     .local v5, "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v10, 0x400
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     new-array v0, v10, [B
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "buffer":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     .local v6, "len":I
a=0;//     :goto_2
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-ne v6, v10, :cond_3
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 73
a=0;//     invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 74
a=0;//     #v8=(Reference,Landroid/net/Uri;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 69
a=0;//     :cond_3
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v7, v0, v10, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 77
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .end local v6    # "len":I
a=0;//     .end local v7    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 78
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v12, 0xa
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v10, v10, v12
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_7
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     .end local v3    # "e":Ljava/lang/Exception;
a=0;//     .restart local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .restart local v7    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v2=(Reference,Ljava/net/HttpURLConnection;);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/io/FileOutputStream;);v10=(Integer);v11=(PosShort);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v12, 0xa
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v10, v10, v12
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_5
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_5
a=0;//     #v10=(Byte);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v7    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Uninit);v13=(Uninit);
a=0;//     move-exception v10
a=0;// 
a=0;//     .line 80
a=0;//     #v10=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const-wide/16 v13, 0xa
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     cmp-long v11, v11, v13
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-gez v11, :cond_6
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :cond_6
a=0;//     #v10=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v10
a=0;// 
a=0;//     .line 86
a=0;//     :cond_7
a=0;//     :try_start_3
a=0;//     #v8=(Reference,Landroid/net/Uri;);v10=(Byte);v11=(LongHi);v12=(LongLo);v13=(LongHi);v14=(Uninit);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v10=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10, v11}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :catch_1
a=0;//     #v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 88
a=0;//     .local v3, "e":Ljava/io/FileNotFoundException;
a=0;//     #v3=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v3}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DownLoadImageTask;->doInBackground([Ljava/lang/Void;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "result"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->imageView:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->imageView:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DownLoadImageTask;->book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/beans/BFBook;->setBookDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DownLoadImageTask;->onPostExecute(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}

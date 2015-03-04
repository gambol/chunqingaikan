package cn.waps; class cl { void a() { int a;
a=0;// .class Lcn/waps/cl;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field b:Z
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field d:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic e:Lcn/waps/bw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/bw;Landroid/content/Context;ZI)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/cl;);
a=0;//     iput-boolean v0, p0, Lcn/waps/cl;->b:Z
a=0;// 
a=0;//     iput v0, p0, Lcn/waps/cl;->c:I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/cl;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-boolean p3, p0, Lcn/waps/cl;->b:Z
a=0;// 
a=0;//     iput p4, p0, Lcn/waps/cl;->c:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 13
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v4, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v0, p0, Lcn/waps/cl;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v0}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/SDKUtils;);
a=0;//     const-string v0, "pop_name"
a=0;// 
a=0;//     const-string v5, "/Android/data/cache/popCache"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->b(Lcn/waps/bw;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->b(Lcn/waps/bw;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "pop_ad_filename"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "pop_name"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     iget-object v8, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v8=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v8}, Lcn/waps/bw;->b(Lcn/waps/bw;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "popTime"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-interface {v8, v9, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long/2addr v6, v8
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v8, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v8=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v8}, Lcn/waps/bw;->c(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     iget-object v8, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v8=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v8}, Lcn/waps/bw;->c(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     const-wide/32 v8, 0x36ee80
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     cmp-long v6, v6, v8
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/bw;->d(Lcn/waps/bw;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/bw;->d(Lcn/waps/bw;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v3}, Lcn/waps/bw;->a(Lcn/waps/bw;Z)Z
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v12=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Null);v3=(Null);v6=(Byte);v7=(LongHi);v8=(LongLo);v12=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v1=(Null);v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, ".dat"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0, v5}, Lcn/waps/SDKUtils;->loadStringFromLocal(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ByteArrayInputStream;);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     iget-object v3, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v3, v1}, Lcn/waps/bw;->a(Lcn/waps/bw;Ljava/io/InputStream;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcn/waps/bw;->a(Lcn/waps/bw;Ljava/util/List;)Ljava/util/List;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v12=(Conflicted);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v0=(Boolean);v1=(Null);v3=(Reference,Ljava/lang/String;);v6=(Byte);v7=(LongHi);v8=(LongLo);v12=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v0}, Lcn/waps/bw;->f(Lcn/waps/bw;)Lcn/waps/ag;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->C()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v4}, Lcn/waps/bw;->e(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Lcn/waps/ag;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v3, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Null);v6=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4, v7}, Lcn/waps/SDKUtils;->deleteLocalFiles(Ljava/io/File;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     :try_start_5
a=0;//     iget-object v6, p0, Lcn/waps/cl;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v7, ".dat"
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_4
a=0;//     :try_start_6
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->f(Lcn/waps/bw;)Lcn/waps/ag;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->C()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v7}, Lcn/waps/bw;->e(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Lcn/waps/ag;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v6, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v0, v6}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     :try_start_7
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v1, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v7}, Lcn/waps/bw;->c(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ".dat"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v1, v6, v5, v7}, Lcn/waps/SDKUtils;->saveDataToLocal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     const-string v1, "pop_ad_filename"
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v4}, Lcn/waps/bw;->c(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v3, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     :goto_5
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Null);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ByteArrayInputStream;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_6
a=0;//     :try_start_9
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v12=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v0, v3}, Lcn/waps/bw;->a(Lcn/waps/bw;Z)Z
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
a=0;// 
a=0;//     :cond_7
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_b
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Null);v3=(Reference,Landroid/content/SharedPreferences$Editor;);v6=(LongLo);v7=(LongHi);v8=(Boolean);v12=(Uninit);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, ".dat"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v4, v3, v5}, Lcn/waps/SDKUtils;->loadStringFromLocal(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/bw;->f(Lcn/waps/bw;)Lcn/waps/ag;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->C()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v7}, Lcn/waps/bw;->e(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v3, v6, v7}, Lcn/waps/ag;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     new-instance v3, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v6, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v7, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v3, v6}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_0
a=0;// 
a=0;//     :try_start_c
a=0;//     #v3=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v1, p0, Lcn/waps/cl;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, ".dat"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v4, v1, v0, v5, v6}, Lcn/waps/SDKUtils;->saveDataToLocal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_2
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     :try_start_d
a=0;//     #v1=(Null);v6=(Boolean);v7=(LongHi);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v0, v3}, Lcn/waps/bw;->a(Lcn/waps/bw;Z)Z
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(Reference,Lcn/waps/bw;);v3=(One);v12=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     :try_start_e
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_8
a=0;//     throw v0
a=0;// 
a=0;//     :catch_5
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_1
a=0;//     #v3=(Reference,Landroid/content/SharedPreferences$Editor;);v7=(Reference,Ujava/lang/Object;);v12=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v12, v1
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v12
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_2
a=0;//     #v8=(Boolean);v12=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_6
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v12, v1
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v12
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_7
a=0;//     #v8=(Boolean);v12=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Null);v6=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/Boolean;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     iget-object v1, p0, Lcn/waps/cl;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/waps/cl;->e:Lcn/waps/bw;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v2}, Lcn/waps/bw;->d(Lcn/waps/bw;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-boolean v3, p0, Lcn/waps/cl;->b:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iget v4, p0, Lcn/waps/cl;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lcn/waps/bw;->a(Lcn/waps/bw;Landroid/content/Context;Ljava/util/List;ZI)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/cl;->a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/cl;->a(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}

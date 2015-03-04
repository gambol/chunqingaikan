package net.slidingmenu.tools.b.b.k; class g { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/k/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static final a(Ljava/io/File;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/io/File;);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/b/b/k/g;->a(Ljava/io/File;)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;Ljava/io/File;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_6
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Reference,Ujava/lang/Object;);v3=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Null);v2=(Null);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_d
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_7
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_6
a=0;// 
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_8
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_7
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_f
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_8
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_d
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     :try_start_9
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v3, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_e
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v4, 0x400
a=0;// 
a=0;//     :try_start_a
a=0;//     #v4=(PosShort);
a=0;//     new-array v4, v4, [B
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Reference,[B);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v1, v4}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_8
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v3, v4, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_2
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_2
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     :goto_6
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_a
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_7
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_d
a=0;//     #v2=(Null);v4=(Reference,[B);v5=(Integer);
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_2
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     :try_start_e
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_9
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_8
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_9
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     :try_start_10
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_b
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_a
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_11
a=0;//     .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_c
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_b
a=0;//     throw v0
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Null);v1=(Null);v2=(Null);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_7
a=0;//     #v1=(Null);v4=(Boolean);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_9
a=0;//     #v0=(One);v4=(Reference,[B);v5=(Integer);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_a
a=0;//     #v0=(Null);v3=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_b
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catch_c
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v2=(Null);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v3=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_d
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Null);v3=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_e
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v4=(Boolean);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_f
a=0;//     #v1=(Null);v3=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "chmod "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final b(Ljava/io/File;)Ljava/io/File;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object p0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     if-ge v1, v4, :cond_1
a=0;// 
a=0;//     sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aget-object v5, v2, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     #p0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}

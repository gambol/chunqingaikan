package cn.waps; class cs { void a() { int a;
a=0;// .class public Lcn/waps/cs;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcn/waps/SDKUtils;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/cs;);
a=0;//     iput-object p1, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p1}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     iput-object v0, p0, Lcn/waps/cs;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v0}, Lcn/waps/SDKUtils;->getInstalled()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;
a=0;// 
a=0;//     iget-object v4, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v1, Lcn/waps/ap;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/ap;);
a=0;//     invoke-direct {v1, p1}, Lcn/waps/ap;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/ap;);
a=0;//     invoke-virtual {v1, p0}, Lcn/waps/ap;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v0, p2, p1}, Lcn/waps/SDKUtils;->loadStringFromLocal(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, p2, p1, v2}, Lcn/waps/SDKUtils;->saveDataToLocal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v0, v2, v0
a=0;// 
a=0;//     const-wide/32 v2, 0x240c8400
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v1, v0}, Lcn/waps/SDKUtils;->deleteLocalFiles(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, p2, p1, v2}, Lcn/waps/SDKUtils;->saveDataToLocal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/SharedPreferences;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v0, "pref_hostsModifyTime"
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {p0, v0, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Long;);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcn/waps/al;->J()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->canWrite()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/Long;);v1=(Boolean);v2=(One);v4=(Reference,Ljava/io/File;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->lastModified()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v5, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     const-wide/16 v7, 0x2710
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v1, v5, v7
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->K()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :try_start_1
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "pref_hostsModifyTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->lastModified()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     #v1=(Byte);v2=(One);v3=(Null);v4=(Reference,Ljava/io/File;);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v5, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v6, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v6, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v5, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/BufferedReader;);
a=0;//     const-string v1, ""
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_4
a=0;//     invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v6, "\n"
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     :cond_5
a=0;//     invoke-static {}, Lcn/waps/al;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     invoke-static {}, Lcn/waps/al;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "b"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v3=(Null);v5=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static a()Z
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v3, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const-string v2, "/system/bin/"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     const-string v2, "/system/xbin/"
a=0;// 
a=0;//     aput-object v2, v3, v0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v4, "/system/sbin/"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     const-string v4, "/sbin/"
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     const-string v4, "/vendor/bin/"
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v2, v4, :cond_1
a=0;// 
a=0;//     aget-object v5, v3, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "su"
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v6=(Reference,Ljava/io/File;);v7=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(II)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Landroid/os/StatFs;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-direct {v2, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v3, v1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     mul-long/2addr v1, v3
a=0;// 
a=0;//     shr-long/2addr v1, p1
a=0;// 
a=0;//     int-to-long v3, p0
a=0;// 
a=0;//     cmp-long v1, v3, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static b()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcn/waps/al;->J()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x2710
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->J()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Byte);v2=(LongHi);v3=(LongLo);v4=(LongHi);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v0, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);
a=0;//     const-string v1, ""
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {}, Lcn/waps/al;->J()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     const-string v1, "ACCESS_WIFI_STATE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/SDKUtils;->hasThePermission(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     const-string v0, "APP_SDK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Permission.ACCESS_WIFI_STATE is not found or the device is Emulator, Please check it!"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcn/waps/ap;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/waps/ap;);
a=0;//     invoke-direct {v2, p1}, Lcn/waps/ap;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/ap;);
a=0;//     invoke-virtual {v2, v1}, Lcn/waps/ap;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static b(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Reference,Ljava/util/List;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static c(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p0, v2}, Lcn/waps/ah;->a(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static d(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v1, v2}, Lcn/waps/ah;->b([BI)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static d(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v3, 0x400
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,[B);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v3, v5, v4}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Reference,Ujava/lang/Object;);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,[B);v4=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, ","
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v4, v3, v4
a=0;// 
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aget-object v0, v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,[Ljava/lang/String;);v2=(Integer);v3=(Reference,[Ljava/lang/String;);v4=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Boolean);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, ","
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v0, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v0, p2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     const-string v1, "AppSettings"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "def_url"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v1, p2}, Lcn/waps/cs;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v2, "android.intent.category.DEFAULT"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Reference,Ljava/lang/Exception;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v0, p2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.category.DEFAULT"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p4}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-static {p3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0, p2, p3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/Exception;);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_4
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, p1, p2}, Lcn/waps/cs;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-static {p1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, p2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Math;->random()D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide/high16 v4, 0x4059000000000000L    # 100.0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     double-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rem-int/lit8 v2, v2, 0x1e
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;)Ljava/net/HttpURLConnection;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v2, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v0}, Lcn/waps/SDKUtils;->isCmwap()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/net/Proxy;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     new-instance v3, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v0, v2, v3}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/Proxy;);
a=0;//     new-instance v2, Ljava/net/URL;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v2, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;Ljava/util/List;[B)Ljava/net/HttpURLConnection;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/cs;->a(Ljava/lang/String;)Ljava/net/HttpURLConnection;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Accept"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Accept-Language"
a=0;// 
a=0;//     const-string v3, "zh-CN"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Referer"
a=0;// 
a=0;//     invoke-virtual {v1, v0, p1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Charset"
a=0;// 
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "User-Agent"
a=0;// 
a=0;//     const-string v3, "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729)"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Connection"
a=0;// 
a=0;//     const-string v3, "Keep-Alive"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v4, v0, v4
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aget-object v0, v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1, v4, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ujava/lang/Object;);v6=(Uninit);
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0, p3}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v6
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Null);v2=(Uninit);v6=(Uninit);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v5, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     throw v0
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/File;);v4=(Reference,Ljava/io/File;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/app/Dialog;Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "AppSettings"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v2, "isRefresh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "tel:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cs;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/SDKUtils;);
a=0;//     const-string v3, "tel:"
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcn/waps/SDKUtils;->callTel(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Reference,Landroid/content/SharedPreferences$Editor;);v5=(Uninit);
a=0;//     const-string v2, "wtai://"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cs;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/SDKUtils;);
a=0;//     const-string v3, ";"
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcn/waps/SDKUtils;->callTel(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(One);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Reference,Landroid/content/SharedPreferences$Editor;);v5=(Uninit);
a=0;//     const-string v2, "http://"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const-string v2, "noRefresh="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const-string v2, "isRefresh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "browser="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     const-string v2, "browser="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_5
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "&"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     new-instance v3, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v4, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v3, v2, p2}, Lcn/waps/SDKUtils;->openUrlByBrowser(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ";http://"
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, ";http://"
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p2, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "http://"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object p2, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-static {p2}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_c
a=0;// 
a=0;//     const-string v3, "load://"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "load://"
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eq v3, v5, :cond_c
a=0;// 
a=0;//     iget-object v5, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p0, v5, v3}, Lcn/waps/cs;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_9
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v2, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v4, Lcn/waps/ct;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/waps/ct;);
a=0;//     invoke-direct {v4, p0, p1, p4}, Lcn/waps/ct;-><init>(Lcn/waps/cs;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/ct;);
a=0;//     invoke-virtual {v2, v4}, Lcn/waps/AppConnect;->a(Lcn/waps/cq;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v2, v3, v4}, Lcn/waps/AppConnect;->a(Ljava/lang/String;I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v2=(Boolean);v4=(Reference,Landroid/content/SharedPreferences$Editor;);v5=(Uninit);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "noRefresh="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     const-string v0, "isRefresh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "browser="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     const-string v0, "browser="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_b
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v5, "&"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_b
a=0;//     #v3=(Integer);v5=(Conflicted);
a=0;//     new-instance v3, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v5, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v5}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v3, v0, v2}, Lcn/waps/SDKUtils;->openUrlByBrowser(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v5=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(One);v3=(Boolean);v5=(Uninit);
a=0;//     const-string v3, "market://"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_f
a=0;// 
a=0;//     :try_start_4
a=0;//     const-string v0, "id="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "market://details?id="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-object v0, v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v0, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
a=0;// 
a=0;//     :try_start_6
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v2, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "Android market is unavailable at this device. To view this link install market."
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "ok"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     new-instance v3, Lcn/waps/cu;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/cu;);
a=0;//     invoke-direct {v3, p0}, Lcn/waps/cu;-><init>(Lcn/waps/cs;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/cu;);
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_7
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(One);v2=(Reference,Ljava/lang/String;);v3=(Boolean);
a=0;//     const-string v3, "noRefresh="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     const-string v2, "isRefresh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_10
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "browser="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_12
a=0;// 
a=0;//     const-string v2, "browser="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_11
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "&"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_11
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     new-instance v3, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v4, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v3, v2, p2}, Lcn/waps/SDKUtils;->openUrlByBrowser(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_12
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v1, v5, v7
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_a
a=0;// 
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v4, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v2, v4, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v4, "\n"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Integer);v3=(Reference,Ljava/io/FileInputStream;);v4=(Integer);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/io/InputStreamReader;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_5
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_5
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_7
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     :cond_8
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_6
a=0;//     throw v0
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Null);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);v2=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_3
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v1=(Conflicted);v2=(Null);v5=(LongLo);v6=(LongHi);v7=(LongLo);v8=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Byte);v2=(Null);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected e(Ljava/lang/String;)[Ljava/lang/Object;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v0, "android.content.pm.PackageParser"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.content.res.AssetManager"
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-class v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v4, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {v4}, Landroid/util/DisplayMetrics;->setToDefaults()V
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-class v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const-class v7, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const-class v7, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const-string v6, "parsePackage"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v7, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aput-object p1, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     aput-object v4, v5, v6
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "applicationInfo"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-class v6, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const-string v5, "addAssetPath"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cs;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const-class v5, Landroid/content/res/Resources;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object v1, v5, v6
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     aput-object v6, v5, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v5, v1
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/res/Resources;
a=0;// 
a=0;//     iget v2, v0, Landroid/content/pm/ApplicationInfo;->icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v2, v4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object v1, v2, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/Object;);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}

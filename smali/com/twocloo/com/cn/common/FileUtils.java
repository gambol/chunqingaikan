package com.twocloo.com.cn.common; class FileUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/FileUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FileUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static SDPATH1:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/FileUtils;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/common/FileUtils;->SDPATH1:Ljava/lang/String;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static delLocal(Landroid/content/Context;Ljava/lang/String;I)V
a=0;//     .locals 13
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "isvip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     new-instance v6, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 116
a=0;//     .local v6, "rd":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/db/LastReadTable;->open()V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v6, p1}, Lcom/twocloo/com/cn/db/LastReadTable;->remove(Ljava/lang/String;)J
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/db/LastReadTable;->close()V
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v1, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1, v10, p2}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteGxOne1(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v1, p1}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteBookById(Ljava/lang/String;)J
a=0;// 
a=0;//     .line 129
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v10, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_DATA_ROOT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 130
a=0;//     .local v0, "dataFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     const-string v10, "dlmulu/dlml"
a=0;// 
a=0;//     invoke-virtual {v10, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v5, v0, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     .local v5, "muluFile":Ljava/io/File;
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     if-nez v10, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v5}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v10, "downBook"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 138
a=0;//     .local v2, "downbookFile":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 139
a=0;//     .local v4, "files":[Ljava/io/File;
a=0;//     #v4=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     array-length v11, v4
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v10=(Integer);v12=(Conflicted);
a=0;//     if-lt v10, v11, :cond_3
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     #v10=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     const-string v10, "rdbook"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v0, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     .local v7, "rdbook":Ljava/io/File;
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 151
a=0;//     .local v8, "rdbookFiles":[Ljava/io/File;
a=0;//     #v8=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 152
a=0;//     array-length v11, v8
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v9=(Conflicted);v10=(Integer);
a=0;//     if-lt v10, v11, :cond_5
a=0;// 
a=0;//     .line 161
a=0;//     :cond_2
a=0;//     #v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     .end local v7    # "rdbook":Ljava/io/File;
a=0;//     .end local v8    # "rdbookFiles":[Ljava/io/File;
a=0;//     :cond_3
a=0;//     #v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Integer);v11=(Integer);
a=0;//     aget-object v3, v4, v10
a=0;// 
a=0;//     .line 141
a=0;//     .local v3, "f":Ljava/io/File;
a=0;//     #v3=(Null);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_4
a=0;// 
a=0;//     .line 143
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/FileUtils;->deleteFiles(Ljava/io/File;)V
a=0;// 
a=0;//     .line 140
a=0;//     :cond_4
a=0;//     #v12=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     .end local v3    # "f":Ljava/io/File;
a=0;//     .restart local v7    # "rdbook":Ljava/io/File;
a=0;//     .restart local v8    # "rdbookFiles":[Ljava/io/File;
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);v7=(Reference,Ljava/io/File;);v8=(Reference,[Ljava/io/File;);v9=(Conflicted);
a=0;//     aget-object v9, v8, v10
a=0;// 
a=0;//     .line 153
a=0;//     .local v9, "rdfile":Ljava/io/File;
a=0;//     #v9=(Null);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_6
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {v9}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 152
a=0;//     :cond_6
a=0;//     #v12=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static deleteFiles(Ljava/io/File;)V
a=0;//     .locals 5
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/io/File;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :cond_1
a=0;//     #v2=(Reference,[Ljava/io/File;);v3=(Integer);
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "temp":Ljava/io/File;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/FileUtils;->deleteFiles(Ljava/io/File;)V
a=0;// 
a=0;//     .line 94
a=0;//     :goto_2
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_2
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 102
a=0;//     .end local v0    # "temp":Ljava/io/File;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public creatSDDir(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 3
a=0;//     .param p1, "dirName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/FileUtils;->SDPATH1:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     .line 47
a=0;//     .local v0, "dir":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdir()Z
a=0;// 
a=0;//     .line 48
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public creatSDFile(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 3
a=0;//     .param p1, "fileName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/FileUtils;->SDPATH1:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     .line 36
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 37
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSDPATH()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     sget-object v0, Lcom/twocloo/com/cn/common/FileUtils;->SDPATH1:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isFileExist(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p1, "fileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/FileUtils;->SDPATH1:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     .line 56
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public write2SDFromInput(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/File;
a=0;//     .locals 7
a=0;//     .param p1, "path"    # Ljava/lang/String;
a=0;//     .param p2, "fileName"    # Ljava/lang/String;
a=0;//     .param p3, "input"    # Ljava/io/InputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 64
a=0;//     .local v2, "file":Ljava/io/File;
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     .local v3, "output":Ljava/io/OutputStream;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/common/FileUtils;->creatSDDir(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Lcom/twocloo/com/cn/common/FileUtils;->creatSDFile(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 68
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 69
a=0;//     .end local v3    # "output":Ljava/io/OutputStream;
a=0;//     .local v4, "output":Ljava/io/OutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v5, 0x1000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v5=(PosShort);
a=0;//     new-array v0, v5, [B
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "buffer":[B
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v5=(Integer);v6=(Conflicted);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 78
a=0;//     :try_start_2
a=0;//     invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 83
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v3    # "output":Ljava/io/OutputStream;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 71
a=0;//     .end local v3    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v0    # "buffer":[B
a=0;//     .restart local v4    # "output":Ljava/io/OutputStream;
a=0;//     :cond_0
a=0;//     :try_start_3
a=0;//     #v0=(Reference,[B);v1=(Uninit);v3=(Null);v4=(Reference,Ljava/io/FileOutputStream;);v5=(Integer);v6=(Byte);
a=0;//     invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     .end local v0    # "buffer":[B
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 75
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     .restart local v3    # "output":Ljava/io/OutputStream;
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 78
a=0;//     :try_start_5
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 79
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 76
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 78
a=0;//     :goto_3
a=0;//     :try_start_6
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     .line 82
a=0;//     :goto_4
a=0;//     throw v5
a=0;// 
a=0;//     .line 79
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 80
a=0;//     .restart local v1    # "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 79
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .end local v3    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v0    # "buffer":[B
a=0;//     .restart local v4    # "output":Ljava/io/OutputStream;
a=0;//     :catch_3
a=0;//     #v0=(Reference,[B);v1=(Uninit);v3=(Null);v4=(Reference,Ljava/io/FileOutputStream;);v5=(Integer);v6=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 80
a=0;//     .restart local v1    # "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v3    # "output":Ljava/io/OutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 76
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .end local v3    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v4    # "output":Ljava/io/OutputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Uninit);v3=(Null);v5=(Integer);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v3    # "output":Ljava/io/OutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 74
a=0;//     :catch_4
a=0;//     #v0=(Uninit);v3=(Null);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// .end method
}}

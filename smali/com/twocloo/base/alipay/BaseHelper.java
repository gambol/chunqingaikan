package com.twocloo.base.alipay; class BaseHelper { void a() { int a;
a=0;// .class public Lcom/twocloo/base/alipay/BaseHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseHelper.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/BaseHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static chmod(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p0, "permission"    # Ljava/lang/String;
a=0;//     .param p1, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "chmod "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "command":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 101
a=0;//     .local v2, "runtime":Ljava/lang/Runtime;
a=0;//     #v2=(Reference,Ljava/lang/Runtime;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 105
a=0;//     .end local v0    # "command":Ljava/lang/String;
a=0;//     .end local v2    # "runtime":Ljava/lang/Runtime;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 102
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 103
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     new-instance v2, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v4, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 38
a=0;//     .local v2, "reader":Ljava/io/BufferedReader;
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     .local v3, "sb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     .local v1, "line":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     .line 53
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_4
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 49
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 46
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_5
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 52
a=0;//     :goto_2
a=0;//     throw v4
a=0;// 
a=0;//     .line 49
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 50
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 49
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_3
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 50
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static getRandomNumChar()C
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     invoke-static {}, Ljava/lang/Math;->random()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide/high16 v2, 0x4024000000000000L    # 10.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x30
a=0;// 
a=0;//     int-to-char v0, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static log(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "tag"    # Ljava/lang/String;
a=0;//     .param p1, "info"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static randomNum(I)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "size"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 179
a=0;//     .local v0, "chars":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Character;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-lt v1, p0, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 186
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     if-lt v1, p0, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 180
a=0;//     .end local v2    # "sb":Ljava/lang/StringBuilder;
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/base/alipay/BaseHelper;->getRandomNumChar()C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Character;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 179
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     .restart local v2    # "sb":Ljava/lang/StringBuilder;
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);v3=(Conflicted);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 186
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "strTitle"    # Ljava/lang/String;
a=0;//     .param p2, "strText"    # Ljava/lang/String;
a=0;//     .param p3, "icon"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 73
a=0;//     const-string v1, "\u786e\u5b9a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static showProgress(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "message"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "indeterminate"    # Z
a=0;//     .param p4, "cancelable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 126
a=0;//     .local v0, "dialog":Landroid/app/ProgressDialog;
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {v0, p3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {v0, p4}, Landroid/app/ProgressDialog;->setCancelable(Z)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 134
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static string2JSON(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 8
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;//     .param p1, "split"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     new-instance v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 146
a=0;//     .local v4, "json":Lorg/json/JSONObject;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 147
a=0;//     .local v1, "arrStr":[Ljava/lang/String;
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     array-length v5, v1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v3, v5, :cond_0
a=0;// 
a=0;//     .line 157
a=0;//     .end local v1    # "arrStr":[Ljava/lang/String;
a=0;//     .end local v3    # "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 148
a=0;//     .restart local v1    # "arrStr":[Ljava/lang/String;
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_0
a=0;//     #v1=(Reference,[Ljava/lang/String;);v2=(Uninit);v3=(Integer);v5=(Integer);
a=0;//     aget-object v5, v1, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-string v6, "="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 149
a=0;//     .local v0, "arrKeyValue":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     aget-object v5, v0, v5
a=0;// 
a=0;//     aget-object v6, v1, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget-object v7, v0, v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 147
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 153
a=0;//     .end local v0    # "arrKeyValue":[Ljava/lang/String;
a=0;//     .end local v1    # "arrStr":[Ljava/lang/String;
a=0;//     .end local v3    # "i":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 154
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static uuid()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 166
a=0;//     .local v0, "uuid":Ljava/util/UUID;
a=0;//     #v0=(Reference,Ljava/util/UUID;);
a=0;//     invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 168
a=0;//     .local v1, "uuidStr":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
}}

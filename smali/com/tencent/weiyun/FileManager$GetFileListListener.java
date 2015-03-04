package com.tencent.weiyun; class FileManager$GetFileListListener { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/FileManager$GetFileListListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/weiyun/FileManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "GetFileListListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mListener:Lcom/tencent/weiyun/IGetFileListListener;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/weiyun/FileManager;Lcom/tencent/weiyun/IGetFileListListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$GetFileListListener;->this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$GetFileListListener;);
a=0;//     iput-object p2, p0, Lcom/tencent/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/weiyun/IGetFileListListener;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 102
a=0;//     :try_start_0
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 103
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v0, "data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 104
a=0;//     const-string v1, "content"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     const-string v1, "content"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 106
a=0;//     #v8=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v6, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);
a=0;//     invoke-virtual {v8}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v6, v0, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v8, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 108
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v0, Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/WeiyunFile;);
a=0;//     const-string v1, "file_id"
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "file_name"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "file_ctime"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, "file_size"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/weiyun/WeiyunFile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 109
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/WeiyunFile;);
a=0;//     invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 106
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v6, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/weiyun/IGetFileListListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/IGetFileListListener;);
a=0;//     invoke-interface {v0, v7}, Lcom/tencent/weiyun/IGetFileListListener;->onComplete(Ljava/util/List;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 117
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 113
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/weiyun/IGetFileListListener;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v2, -0x4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const-string v3, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/weiyun/IGetFileListListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/weiyun/IGetFileListListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/IGetFileListListener;);
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/weiyun/IGetFileListListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
}}

package com.lidroid.xutils.util; class MimeTypeUtils { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/MimeTypeUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MimeTypeUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/MimeTypeUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getMimeType(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "fileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const-string v2, "application/octet-stream"
a=0;// 
a=0;//     .line 32
a=0;//     .local v2, "result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 33
a=0;//     .local v1, "extPos":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "ext":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/webkit/MimeTypeMap;);
a=0;//     invoke-virtual {v3, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 37
a=0;//     .end local v0    # "ext":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
}}

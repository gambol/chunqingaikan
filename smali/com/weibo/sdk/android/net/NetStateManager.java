package com.weibo.sdk.android.net; class NetStateManager { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/net/NetStateManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NetStateManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/weibo/sdk/android/net/NetStateManager$NetState;,
a=0;//         Lcom/weibo/sdk/android/net/NetStateManager$NetStateReceive;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static CUR_NETSTATE:Lcom/weibo/sdk/android/net/NetStateManager$NetState;
a=0;// 
a=0;// .field private static mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     sget-object v0, Lcom/weibo/sdk/android/net/NetStateManager$NetState;->Mobile:Lcom/weibo/sdk/android/net/NetStateManager$NetState;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/net/NetStateManager$NetState;);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/net/NetStateManager;->CUR_NETSTATE:Lcom/weibo/sdk/android/net/NetStateManager$NetState;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/net/NetStateManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     sput-object p0, Lcom/weibo/sdk/android/net/NetStateManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAPN()Lorg/apache/http/HttpHost;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     .local v7, "proxy":Lorg/apache/http/HttpHost;
a=0;//     #v7=(Null);
a=0;//     const-string v0, "content://telephony/carriers/preferapn"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     .local v1, "uri":Landroid/net/Uri;
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     .local v6, "mCursor":Landroid/database/Cursor;
a=0;//     #v6=(Null);
a=0;//     sget-object v0, Lcom/weibo/sdk/android/net/NetStateManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/weibo/sdk/android/net/NetStateManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 56
a=0;//     const-string v0, "proxy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 57
a=0;//     .local v8, "proxyStr":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v7, Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     .end local v7    # "proxy":Lorg/apache/http/HttpHost;
a=0;//     #v7=(UninitRef,Lorg/apache/http/HttpHost;);
a=0;//     const/16 v0, 0x50
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {v7, v8, v0}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 60
a=0;//     .restart local v7    # "proxy":Lorg/apache/http/HttpHost;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v7=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-interface {v6}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 62
a=0;//     .end local v8    # "proxyStr":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     return-object v7
a=0;// .end method
}}

package com.lidroid.xutils.util; class CharsetUtils { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/CharsetUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CharsetUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEFAULT_ENCODING_CHARSET:Ljava/lang/String; = "ISO-8859-1"
a=0;// 
a=0;// .field public static final SUPPORT_CHARSET:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     .line 66
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "ISO-8859-1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 68
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "GB2312"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 69
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "GBK"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 70
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "GB18030"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "US-ASCII"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 73
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "ASCII"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 75
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "ISO-2022-KR"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "ISO-8859-2"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 79
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "ISO-2022-JP"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 80
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "ISO-2022-JP-2"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 82
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/CharsetUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getEncoding(Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;//     .param p1, "judgeCharsetLength"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const-string v1, "ISO-8859-1"
a=0;// 
a=0;//     .line 43
a=0;//     .local v1, "encode":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/CharsetUtils;->SUPPORT_CHARSET:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .line 43
a=0;//     :cond_1
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "charset":Ljava/lang/String;
a=0;//     invoke-static {p0, v0, p1}, Lcom/lidroid/xutils/util/CharsetUtils;->isCharset(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 46
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isCharset(Ljava/lang/String;Ljava/lang/String;I)Z
a=0;//     .locals 5
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;//     .param p2, "judgeCharsetLength"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, p2, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 55
a=0;//     .local v1, "temp":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Integer);
a=0;//     new-instance v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-direct {v3, v4, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 57
a=0;//     .end local v1    # "temp":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Integer);v4=(Uninit);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 54
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static toCharset(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;//     .param p2, "judgeCharsetLength"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     :try_start_0
a=0;//     invoke-static {p0, p2}, Lcom/lidroid/xutils/util/CharsetUtils;->getEncoding(Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 34
a=0;//     .local v1, "oldCharset":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-direct {v2, v3, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object p0, v2
a=0;// 
a=0;//     .line 37
a=0;//     .end local v1    # "oldCharset":Ljava/lang/String;
a=0;//     .end local p0    # "str":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 35
a=0;//     .restart local p0    # "str":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "ex":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->w(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

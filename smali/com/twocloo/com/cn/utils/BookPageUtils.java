package com.twocloo.com.cn.utils; class BookPageUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/BookPageUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookPageUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final BLANK:I = 0x3000
a=0;// 
a=0;// .field public static final BLANK_LINE_HEIGHT:I = 0xd
a=0;// 
a=0;// .field public static final EMPTY_CHAR:C = '\u0000'
a=0;// 
a=0;// .field public static final EMPTY_LINE_HEIGHT:I = 0x14
a=0;// 
a=0;// .field public static final IGNORE_CHAR:I = 0xfffd
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/BookPageUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static checkIsParaEnd(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p0, "line"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     const/16 v2, 0x3000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 28
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static checkIsVipChapter(Lcom/twocloo/com/cn/beans/BFBook;Lcom/twocloo/com/cn/beans/RDBook;)Z
a=0;//     .locals 2
a=0;//     .param p0, "bf"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .param p1, "rd"    # Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/BookPageUtils;->checkIsVipChapter(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 42
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static checkIsVipChapter(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p0, "aid"    # Ljava/lang/String;
a=0;//     .param p1, "tid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "mul":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p1, v1}, Lcom/twocloo/com/cn/utils/BookPageUtils;->isVipChapter(Ljava/lang/String;Ljava/util/ArrayList;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 50
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isVipChapter(Ljava/lang/String;Ljava/util/ArrayList;)Z
a=0;//     .locals 5
a=0;//     .param p0, "cId"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "mulist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 61
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 61
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(One);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 62
a=0;//     .local v0, "cInfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 65
a=0;//     .local v1, "isVip":I
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

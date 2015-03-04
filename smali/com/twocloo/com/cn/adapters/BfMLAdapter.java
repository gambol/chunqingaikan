package com.twocloo.com.cn.adapters; class BfMLAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "BfMLAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private final data:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private isFromBaseReadbook:Z
a=0;// 
a=0;// .field private nowcheckly:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private nowtextid:Ljava/lang/String;
a=0;// 
a=0;// .field private obj:Ljava/lang/Object;
a=0;// 
a=0;// .field private orderedChapterTextidSet:Ljava/util/HashSet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/HashSet;Ljava/lang/String;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p3, "nowtextid"    # Ljava/lang/String;
a=0;//     .param p5, "articid"    # Ljava/lang/String;
a=0;//     .param p6, "isFromBase"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Z)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     .local p2, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     .local p4, "ydy":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/BfMLAdapter;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 33
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->nowtextid:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->orderedChapterTextidSet:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 35
a=0;//     iput-boolean p6, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->isFromBaseReadbook:Z
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelection()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "i":I
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     return v0
a=0;// 
a=0;//     .line 100
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_1
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 101
a=0;//     .local v1, "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->nowtextid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 8
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v6=(Null);
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;);
a=0;//     invoke-direct {v1, v5}, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;-><init>(Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;)V
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "tag":Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$layout;->novel_sbxxy_mulu_item:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 55
a=0;//     .local v2, "view":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_muitem_zj:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->chapterName:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 56
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_muitem_vip:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 58
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->linearLayout2:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->continueReadLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 59
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->mululine:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iput-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->mululine:Landroid/view/View;
a=0;// 
a=0;//     .line 60
a=0;//     move-object p2, v2
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 65
a=0;//     .end local v2    # "view":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->isFromBaseReadbook:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->mululine:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->chapterName:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v4, 0xdc
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMaxWidth(I)V
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->chapterName:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/TextView;->setSingleLine(Z)V
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->chapterName:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMaxLines(I)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->nowtextid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->chapterName:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->continueReadLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v3, Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/widget/ListView;->setSelection(I)V
a=0;// 
a=0;//     .line 83
a=0;//     :goto_1
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->chapterName:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->orderedChapterTextidSet:Ljava/util/HashSet;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->orderedChapterTextidSet:Ljava/util/HashSet;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v4, "\u5df2\u8ba2\u9605"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v4, 0x33
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v5, 0x99
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-static {v4, v5, v6}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     return-object p2
a=0;// 
a=0;//     .line 63
a=0;//     .end local v0    # "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v1    # "tag":Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;
a=0;// 
a=0;//     .restart local v1    # "tag":Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     .restart local v0    # "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);v2=(Conflicted);v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->chapterName:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->continueReadLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v4, "\u514d\u8d39"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 90
a=0;//     :cond_5
a=0;//     #v3=(Integer);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$color;->red_text:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/BfMLAdapter$ShubenmuluHolder;->vip:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v4, "VIP"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}

package com.twocloo.com.cn.fragment; class SearchKeyWordsFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "SearchKeyWordsFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private listView:Landroid/widget/ListView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 29
a=0;//     new-instance v0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$1;-><init>(Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;)Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->hot_keyword_fragment:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->hot_keyword:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/HotKeyWordsThread;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/HotKeyWordsThread;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/threads/HotKeyWordsThread;->start()V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$2;-><init>(Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$2;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 56
a=0;//     return-object v0
a=0;// .end method
}}

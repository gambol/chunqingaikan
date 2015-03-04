package com.twocloo.com.cn.fragment; class SearchHotKeyFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "SearchHotKeyFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private hortory:Landroid/widget/Button;
a=0;// 
a=0;// .field private key:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initview(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->hot_words:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     .line 34
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->lishijulu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 42
a=0;//     #v1=(Byte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->circle_ret_red:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     const v1, 0xfff9999
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     :cond_1
a=0;//     #v1=(Byte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->circle_ret_red:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v1, -0x6667
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 5
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     sget v3, Lcom/twocloo/com/cn/R$layout;->search_keywords_fragment:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v3, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 24
a=0;//     .local v2, "view":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v2}, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->initview(Landroid/view/View;)V
a=0;// 
a=0;//     .line 25
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 26
a=0;//     .local v0, "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 27
a=0;//     .local v1, "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->mainfragment:I
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     invoke-direct {v4}, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 29
a=0;//     return-object v2
a=0;// .end method
}}

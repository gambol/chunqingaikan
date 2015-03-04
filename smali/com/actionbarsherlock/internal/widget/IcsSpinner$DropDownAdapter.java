package com.actionbarsherlock.internal.widget; class IcsSpinner$DropDownAdapter { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IcsSpinner.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/ListAdapter;
a=0;// .implements Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "DropDownAdapter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;// .field private mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/widget/SpinnerAdapter;)V
a=0;//     .locals 1
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 484
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .line 485
a=0;//     instance-of v0, p1, Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 486
a=0;//     check-cast p1, Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .end local p1    # "adapter":Landroid/widget/SpinnerAdapter;
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 488
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public areAllItemsEnabled()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 532
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 533
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 536
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 491
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 508
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/widget/SpinnerAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemViewType(I)I
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 503
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getViewTypeCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hasStableIds()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->hasStableIds()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isEnabled(I)Z
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 545
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 546
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 547
a=0;//     invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 549
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;//     .locals 1
a=0;//     .param p1, "observer"    # Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .prologue
a=0;//     .line 516
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 517
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 519
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;//     .locals 1
a=0;//     .param p1, "observer"    # Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 523
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 525
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}

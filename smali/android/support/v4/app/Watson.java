package android.support.v4.app; class Watson { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/app/Watson;
a=0;// .super Landroid/support/v4/app/FragmentActivity;
a=0;// .source "Watson.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/ActionBarSherlock$OnCreatePanelMenuListener;
a=0;// .implements Lcom/actionbarsherlock/ActionBarSherlock$OnMenuItemSelectedListener;
a=0;// .implements Lcom/actionbarsherlock/ActionBarSherlock$OnPreparePanelListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/Watson$OnCreateOptionsMenuListener;,
a=0;//         Landroid/support/v4/app/Watson$OnOptionsItemSelectedListener;,
a=0;//         Landroid/support/v4/app/Watson$OnPrepareOptionsMenuListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "Watson"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCreatedMenus:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/Watson;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract getSupportMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;
a=0;// .end method
a=0;// 
a=0;// .method public abstract onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// .end method
a=0;// 
a=0;// .method public onCreatePanelMenu(ILcom/actionbarsherlock/view/Menu;)Z
a=0;//     .locals 7
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     if-nez p1, :cond_8
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/app/Watson;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 48
a=0;//     .local v4, "result":Z
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Watson;->getSupportMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 49
a=0;//     .local v2, "inflater":Lcom/actionbarsherlock/view/MenuInflater;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     .local v5, "show":Z
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     .local v3, "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     #v3=(Null);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v6, v6, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Reference,Ljava/util/ArrayList;);v5=(Boolean);v6=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v6, v6, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v1, v6, :cond_2
a=0;// 
a=0;//     .line 65
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/Watson;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v6=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/Watson;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v1, v6, :cond_5
a=0;// 
a=0;//     .line 74
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     iput-object v3, p0, Landroid/support/v4/app/Watson;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 77
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     .line 82
a=0;//     .end local v2    # "inflater":Lcom/actionbarsherlock/view/MenuInflater;
a=0;//     .end local v3    # "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     .end local v4    # "result":Z
a=0;//     .end local v5    # "show":Z
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 53
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v2    # "inflater":Lcom/actionbarsherlock/view/MenuInflater;
a=0;//     .restart local v3    # "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     .restart local v4    # "result":Z
a=0;//     .restart local v5    # "show":Z
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);v3=(Reference,Ljava/util/ArrayList;);v5=(Boolean);v6=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v6, v6, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     instance-of v6, v0, Landroid/support/v4/app/Watson$OnCreateOptionsMenuListener;
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     .line 56
a=0;//     #v6=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     check-cast v6, Landroid/support/v4/app/Watson$OnCreateOptionsMenuListener;
a=0;// 
a=0;//     invoke-interface {v6, p2, v2}, Landroid/support/v4/app/Watson$OnCreateOptionsMenuListener;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
a=0;// 
a=0;//     .line 57
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v3    # "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 60
a=0;//     .restart local v3    # "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     :cond_3
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 52
a=0;//     :cond_4
a=0;//     #v5=(Boolean);v6=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v6=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/Watson;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 68
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     .line 69
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->onDestroyOptionsMenu()V
a=0;// 
a=0;//     .line 66
a=0;//     :cond_7
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 82
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "inflater":Lcom/actionbarsherlock/view/MenuInflater;
a=0;//     .end local v3    # "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     .end local v4    # "result":Z
a=0;//     .end local v5    # "show":Z
a=0;//     :cond_8
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(ILcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 4
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 118
a=0;//     #v2=(One);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/app/Watson;->onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_3
a=0;// 
a=0;//     .line 134
a=0;//     .end local v1    # "i":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(One);v3=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 126
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     instance-of v3, v0, Landroid/support/v4/app/Watson$OnOptionsItemSelectedListener;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 127
a=0;//     check-cast v0, Landroid/support/v4/app/Watson$OnOptionsItemSelectedListener;
a=0;// 
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     invoke-interface {v0, p2}, Landroid/support/v4/app/Watson$OnOptionsItemSelectedListener;->onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public abstract onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// .end method
a=0;// 
a=0;// .method public onPreparePanel(ILandroid/view/View;Lcom/actionbarsherlock/view/Menu;)Z
a=0;//     .locals 5
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/app/Watson;->onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 93
a=0;//     .local v2, "result":Z
a=0;//     #v2=(Boolean);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     .local v3, "show":Z
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Boolean);v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v1, v4, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     .line 107
a=0;//     invoke-interface {p3}, Lcom/actionbarsherlock/view/Menu;->hasVisibleItems()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     and-int/2addr v2, v4
a=0;// 
a=0;//     .line 111
a=0;//     .end local v2    # "result":Z
a=0;//     .end local v3    # "show":Z
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 96
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v2    # "result":Z
a=0;//     .restart local v3    # "show":Z
a=0;//     :cond_1
a=0;//     #v1=(Integer);v3=(Boolean);v4=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/Watson;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 97
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     instance-of v4, v0, Landroid/support/v4/app/Watson$OnPrepareOptionsMenuListener;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 98
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     #v3=(One);
a=0;//     check-cast v0, Landroid/support/v4/app/Watson$OnPrepareOptionsMenuListener;
a=0;// 
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     invoke-interface {v0, p3}, Landroid/support/v4/app/Watson$OnPrepareOptionsMenuListener;->onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "result":Z
a=0;//     .end local v3    # "show":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}

package com.actionbarsherlock.internal.view.menu; class ActionMenu { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/ActionMenu;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionMenu.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mIsQwerty:Z
a=0;// 
a=0;// .field private mItems:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenu;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private findItemIndex(I)I
a=0;//     .locals 4
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 131
a=0;//     .local v2, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 132
a=0;//     .local v1, "itemCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 138
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     return v0
a=0;// 
a=0;//     .line 133
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_1
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v3, p1, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private findItemWithShortcut(ILandroid/view/KeyEvent;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     .locals 6
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-boolean v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mIsQwerty:Z
a=0;// 
a=0;//     .line 165
a=0;//     .local v4, "qwerty":Z
a=0;//     #v4=(Boolean);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 166
a=0;//     .local v3, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 168
a=0;//     .local v2, "itemCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 169
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     .line 170
a=0;//     .local v1, "item":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->getAlphabeticShortcut()C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 172
a=0;//     .local v5, "shortcut":C
a=0;//     :goto_1
a=0;//     #v5=(Char);
a=0;//     if-eq p1, v5, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     .end local v5    # "shortcut":C
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->getNumericShortcut()C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, v0, v0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->add(IIII)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(IIII)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 7
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     .line 65
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;-><init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "item":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 68
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, v0, v0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Lcom/actionbarsherlock/view/MenuItem;)I
a=0;//     .locals 13
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "caller"    # Landroid/content/ComponentName;
a=0;//     .param p5, "specifics"    # [Landroid/content/Intent;
a=0;//     .param p6, "intent"    # Landroid/content/Intent;
a=0;//     .param p7, "flags"    # I
a=0;//     .param p8, "outSpecificItems"    # [Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v10=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 76
a=0;//     .local v7, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v7=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     #v1=(Reference,[Landroid/content/Intent;);
a=0;//     move-object/from16 v2, p6
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v7, v0, v1, v2, v10}, Landroid/content/pm/PackageManager;->queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 77
a=0;//     .local v6, "lri":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 79
a=0;//     .local v3, "N":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v10, p7, 0x1
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-nez v10, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->removeGroup(I)V
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-lt v4, v3, :cond_2
a=0;// 
a=0;//     .line 98
a=0;//     return v3
a=0;// 
a=0;//     .line 77
a=0;//     .end local v3    # "N":I
a=0;//     .end local v4    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v11=(Uninit);v12=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     .restart local v3    # "N":I
a=0;//     .restart local v4    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Integer);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 85
a=0;//     .local v8, "ri":Landroid/content/pm/ResolveInfo;
a=0;//     new-instance v9, Landroid/content/Intent;
a=0;// 
a=0;//     .line 86
a=0;//     #v9=(UninitRef,Landroid/content/Intent;);
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-gez v10, :cond_4
a=0;// 
a=0;//     move-object/from16 v10, p6
a=0;// 
a=0;//     .line 85
a=0;//     :goto_2
a=0;//     #v10=(Reference,Landroid/content/Intent;);
a=0;//     invoke-direct {v9, v10}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 87
a=0;//     .local v9, "rintent":Landroid/content/Intent;
a=0;//     #v9=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v10, Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 88
a=0;//     #v10=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v11, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v11, v11, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v12, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v12=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v12, v12, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v10, v11, v12}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     #v10=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v8, v7}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, p2, v0, v10}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v8, v7}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-interface {v10, v11}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 92
a=0;//     invoke-interface {v10, v9}, Lcom/actionbarsherlock/view/MenuItem;->setIntent(Landroid/content/Intent;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 93
a=0;//     .local v5, "item":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     if-eqz p8, :cond_3
a=0;// 
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ltz v10, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     aput-object v5, p8, v10
a=0;// 
a=0;//     .line 83
a=0;//     :cond_3
a=0;//     #v10=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 86
a=0;//     .end local v5    # "item":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .end local v9    # "rintent":Landroid/content/Intent;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v5=(Conflicted);v9=(UninitRef,Landroid/content/Intent;);v10=(Integer);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     aget-object v10, p5, v10
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(I)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(IIII)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public findItem(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->findItemIndex(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasVisibleItems()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 151
a=0;//     .local v2, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 153
a=0;//     .local v1, "itemCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->isVisible()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isShortcutKey(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->findItemWithShortcut(ILandroid/view/KeyEvent;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public performIdentifierAction(II)Z
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->findItemIndex(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "index":I
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->invoke()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public performShortcut(ILandroid/view/KeyEvent;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;//     .param p3, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->findItemWithShortcut(ILandroid/view/KeyEvent;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "item":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 198
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->invoke()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeGroup(I)V
a=0;//     .locals 4
a=0;//     .param p1, "groupId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 203
a=0;//     .local v2, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 204
a=0;//     .local v1, "itemCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     return-void
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->getGroupId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_1
a=0;// 
a=0;//     .line 207
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 208
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 209
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeItem(I)V
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->findItemIndex(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupCheckable(IZZ)V
a=0;//     .locals 5
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "checkable"    # Z
a=0;//     .param p3, "exclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 222
a=0;//     .local v3, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 224
a=0;//     .local v2, "itemCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     return-void
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     .line 226
a=0;//     .local v1, "item":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->getGroupId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p1, :cond_1
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {v1, p2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->setCheckable(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 228
a=0;//     invoke-virtual {v1, p3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->setExclusiveCheckable(Z)Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     .line 224
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setGroupEnabled(IZ)V
a=0;//     .locals 5
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 235
a=0;//     .local v3, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 237
a=0;//     .local v2, "itemCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     return-void
a=0;// 
a=0;//     .line 238
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     .line 239
a=0;//     .local v1, "item":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->getGroupId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p1, :cond_1
a=0;// 
a=0;//     .line 240
a=0;//     invoke-virtual {v1, p2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->setEnabled(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setGroupVisible(IZ)V
a=0;//     .locals 5
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 247
a=0;//     .local v3, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 249
a=0;//     .local v2, "itemCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     return-void
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     .line 251
a=0;//     .local v1, "item":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->getGroupId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p1, :cond_1
a=0;// 
a=0;//     .line 252
a=0;//     invoke-virtual {v1, p2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 249
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setQwertyMode(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "isQwerty"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mIsQwerty:Z
a=0;// 
a=0;//     .line 259
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenu;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}

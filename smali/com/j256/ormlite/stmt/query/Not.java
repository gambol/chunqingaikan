package com.j256.ormlite.stmt.query; class Not { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/query/Not;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Not.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/query/Clause;
a=0;// .implements Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;// .field private exists:Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/query/Not;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->exists:Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;//     .locals 1
a=0;//     .param p1, "clause"    # Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 32
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/query/Not;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->exists:Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     .line 33
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/query/Not;->setMissingClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 2
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .param p3, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     .local p4, "selectArgList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Comparison;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->exists:Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Clause has not been set in NOT operation"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     const-string v0, "(NOT "
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->exists:Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/query/Exists;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     const-string v0, ") "
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     const-string v0, "(NOT "
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 59
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 60
a=0;//     invoke-interface {p1, p3, p2}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     const/16 v0, 0x2e
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 63
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Comparison;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/stmt/query/Comparison;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1, p3, v0}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Comparison;);
a=0;//     invoke-interface {v0, p3}, Lcom/j256/ormlite/stmt/query/Comparison;->appendOperation(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     invoke-interface {v0, p1, p3, p4}, Lcom/j256/ormlite/stmt/query/Comparison;->appendValue(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setMissingClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;//     .locals 3
a=0;//     .param p1, "clause"    # Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Comparison;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "NOT operation already has a comparison set"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     instance-of v0, p1, Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     check-cast p1, Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     .end local p1    # "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     .line 46
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 41
a=0;//     .restart local p1    # "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     :cond_1
a=0;//     instance-of v0, p1, Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 42
a=0;//     check-cast p1, Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     .end local p1    # "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/query/Not;->exists:Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     .restart local p1    # "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     :cond_2
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "NOT operation can only work with comparison SQL clauses, not "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Comparison;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     const-string v0, "NOT without comparison"
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "NOT comparison "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/query/Not;->comparison:Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}

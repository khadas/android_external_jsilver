/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.node;

import java.util.*;
import com.google.clearsilver.jsilver.syntax.analysis.*;

@SuppressWarnings("nls")
public final class ACallCommand extends PCommand
{
    private PPosition _position_;
    private final LinkedList<TWord> _macro_ = new LinkedList<TWord>();
    private final LinkedList<PExpression> _arguments_ = new LinkedList<PExpression>();

    public ACallCommand()
    {
        // Constructor
    }

    public ACallCommand(
        @SuppressWarnings("hiding") PPosition _position_,
        @SuppressWarnings("hiding") List<TWord> _macro_,
        @SuppressWarnings("hiding") List<PExpression> _arguments_)
    {
        // Constructor
        setPosition(_position_);

        setMacro(_macro_);

        setArguments(_arguments_);

    }

    @Override
    public Object clone()
    {
        return new ACallCommand(
            cloneNode(this._position_),
            cloneList(this._macro_),
            cloneList(this._arguments_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACallCommand(this);
    }

    public PPosition getPosition()
    {
        return this._position_;
    }

    public void setPosition(PPosition node)
    {
        if(this._position_ != null)
        {
            this._position_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._position_ = node;
    }

    public LinkedList<TWord> getMacro()
    {
        return this._macro_;
    }

    public void setMacro(List<TWord> list)
    {
        this._macro_.clear();
        this._macro_.addAll(list);
        for(TWord e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PExpression> getArguments()
    {
        return this._arguments_;
    }

    public void setArguments(List<PExpression> list)
    {
        this._arguments_.clear();
        this._arguments_.addAll(list);
        for(PExpression e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._position_)
            + toString(this._macro_)
            + toString(this._arguments_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._position_ == child)
        {
            this._position_ = null;
            return;
        }

        if(this._macro_.remove(child))
        {
            return;
        }

        if(this._arguments_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._position_ == oldChild)
        {
            setPosition((PPosition) newChild);
            return;
        }

        for(ListIterator<TWord> i = this._macro_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TWord) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PExpression> i = this._arguments_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExpression) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}